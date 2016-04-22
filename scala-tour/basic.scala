/* ------------------------------------------------------ */

class Person(val firstName: String, val lastName: String) {
	private var _age = 0
	def age = _age
	def age_=(newAge: Int) = _age = newAge
	def fullName() = firstName + " " + lastName
	override def toString() = fullName()
}

val obama: Person = new Person("Barack", "Obama")
println("Person: " + obama)
println("firstName: " + obama.firstName)
println("lastName: " + obama.lastName)
//obama.age_=(51)
obama.age = 51
println("age: " + obama.age)

/* ------------------------------------------------------ */

def withClose[A <: {def close(): Unit }, B](closeAble: A)(f: A => B): B =
	try {
		f(closeAble)
	} finally {
		closeAble.close()
	}

class Connection {
	def close() = println("close Connection")
}

val conn: Connection = new Connection()
val msg = withClose(conn) {
	conn => {
		println("do something with Connection")
		"123456"
	}
}

println(msg)

/* ------------------------------------------------------ */
trait ForEachAble[A] {
	def iterator: java.util.Iterator[A]
	def foreach(f: A => Unit) = {
		val iter = iterator
		while (iter.hasNext) {
			f(iter.next)
		}
	}
}

trait JsonAble {
	def toJson() = scala.util.parsing.json.JSONFormat.defaultFormatter(this)
}

val list = new java.util.ArrayList[Int]() with ForEachAble[Int] with JsonAble
list.add(1)
list.add(2)
list.foreach(x => println(x))
println(list.toJson)

