
import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf
import org.apache.spark.rdd._

val db = sqlContext.read.json("hdfs://localhost:9000/db.json")

/*
object SimpleApp {
  def main() {
    val logFile = "hdfs://localhost:9000/sample.txt" // Should be some file on your system
    val logData = sc.textFile(logFile, 2).cache()

    val numAs = logData.filter(line => line.contains("a")).count()
    val numBs = logData.filter(line => line.contains("b")).count()
    println("Lines with a: %s, Lines with b: %s".format(numAs, numBs))

    val rdd2=logFile.flatMap(line => line.split(" ")).map(word => (word,1)).reduceByKey(_+_).sortBy(_._2, false)
    rdd2.collect()

    val data = Array(1,2,3,4,5,6,7,8,10,3,2,4,1,5,6)
    val cnt = sc.parallelize(data).map {(_,1)}.reduceByKey(_ + _).collect().sortWith(_._1 < _._1)
    cnt.foreach(print)
  }
}
*/

object SimpleApp {
  def main() {
    val logFile = "hdfs://localhost:9000/sample.txt" // Should be some file on your system
    val logData = sc.textFile(logFile, 2).cache()
    val numAs = logData.filter(line => line.contains("a")).count()
    val numBs = logData.filter(line => line.contains("b")).count()
    println("Lines with a: %s, Lines with b: %s".format(numAs, numBs))

    val rdd2=logFile.flatMap(line => line.split(" ")).map(word => (word,1)).reduceByKey(_+_).sortBy(_._2, false)
    rdd2.collect()

    val data = Array(1,2,3,4,5,6,7,8,10,3,2,4,1,5,6)
    val cnt = sc.parallelize(data).map {(_,1)}.reduceByKey(_ + _).collect().sortWith(_._1 < _._1)
    cnt.foreach(print)
  }
}

