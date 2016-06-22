// Starter Code for Exercise 6
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

val friends2 = Vector(
  new Friend("Zach", "Smith", "zach@smith.com"),
  new Friend("Mary", "Add", "mary@add.com"),
  new Friend("Sally","Taylor","sally@taylor.com"),
  new Friend("Mary", "Smith", "mary@smith.com")
)

val friends3 = Vector(
  new Friend("Zach", "Smith", "zach@smith.com"),
  new Friend("Mary", "Add", "mary@add.com"),
  new Friend("Sally","Taylor","sally@taylor.com"),
  new Friend("Mary", "Smith", "mary@smith.com")
)

val s3 = friends3.sortBy(_.second)
val s4 = s3.sortBy(_.first)
s4 is "Vector(Mary Add, Mary Smith, Sally Taylor, Zach Smith)"
