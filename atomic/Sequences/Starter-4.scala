// Starter Code for Exercise 4
// From "Sequences" atom
import com.atomicscala.AtomicTest._

case class Person(first: String, second: String) {
	def fullName = s"$first $second"
}

trait Contact {
	val email: String
}

class Friend(first: String, second: String, val email: String) 
extends Person(first, second) 
with Contact {
	override def toString = super.fullName
}

val friends = Vector(
  new Friend("Zach", "Smith", "zach@smith.com"),
  new Friend("Mary", "Add", "mary@add.com"),
  new Friend("Sally","Taylor","sally@taylor.com")
)

val sorted = friends.sortBy(_.email)
sorted is "Vector(Mary Add, Sally Taylor, Zach Smith)"
