import scala.io._
import java.io._

import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf
import org.apache.spark.rdd._
import org.apache.spark.sql.DataFrame

import scala.collection.mutable.ArrayBuffer
import scala.collection.mutable.{Map => MMap}
import scala.util.parsing.json.JSON
import scala.util.Try
import scala.util.Random

def mergeJson(ss: Iterator[String]) = {
	val objs = ArrayBuffer[String]()
	var obj = "";
	for (str <- ss) {
		if (str.contains("{")) 
			obj = "{"
		else 
			if (str.contains("}")) 	
				objs += obj + "}"
			else
				obj += str
	}
	objs.toArray
}

def duplicateRDD(objs: RDD[String]) = {
	def duplicate(obj: Option[Any]): Array[String] = {
		if (obj == None)
			return Array[String]()
		val obj1 = obj.get.asInstanceOf[Map[String, String]]		
		val obj2 = obj1.filterKeys(k => !k.startsWith("hdfs_") && k != "id" && k != "xgsj")
		val obj3 = obj2.filter(!_._2.isEmpty)
		val objs = ArrayBuffer[String]()
		for ((key, value) <- obj3) {
			val int = Try(value.toInt)
			val mValue = if (int.isSuccess) (int.get + Random.nextInt(10)).toString	else "test: " + value
			val mID = (obj1.apply("id").toInt + Random.nextInt(10)).toString
			val mXGSJ = "1" + (Random.nextInt(90) + 10) + obj1.apply("xgsj").substring(3)
			val mObj = obj1.updated(key, mValue).updated("id", mID).updated("xgsj", mXGSJ)
			val str = mObj.foldLeft("")((s, kv) => s + ", \"" + kv._1 + "\" : \"" + kv._2 + "\"")
			if (!str.isEmpty) 
				objs += "{ " + str.substring(1) + " }"
		}
		objs.toArray
	}
	objs.map(JSON.parseFull).flatMap(duplicate)
}

def splitTable(df: DataFrame) = {
	val c = Array("hdfs_prison", "hdfs_db", "hdfs_table")
	val keys = df.select(c(0), c(1), c(2)).distinct	
	val tables = MMap[String, DataFrame]()
	for (key <- keys) {
		val table = df.filter(df(c(0)) === key(0) && df(c(1)) === key(1) && df(c(2)) === key(2))
		tables += key.toString -> table
	}
	tables.toMap
}

// the path
val localDir = "/home/motao/mt/data/"
val hdfsDir = "hdfs://localhost:9000/"
val localData = localDir + "sample.json"
val hdfsData = hdfsDir + "sample.json"
val hdfsDuplicateData = hdfsDir + "duplicate.json"

// merge multi-line json to one object per line
//sc.parallelize(mergeJson(Source.fromFile(localData).getLines())).saveAsTextFile(hdfsData)

// duplicate the data
//duplicateRDD(sc.textFile(hdfsData)).saveAsTextFile(hdfsDuplicateData)

// make the tables
splitTable(sqlContext.read.json(hdfsDuplicateData)).foreach(kv => kv._2.toJSON.saveAsTextFile(hdfsDir + kv._1 + ".json"))
