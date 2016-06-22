// Starter Code for Exercise 3
// From "Sequences" atom
import com.atomicscala.AtomicTest._

case class Person(first: String, second: String, email: String) {
	def fullName = s"$first $second"
}

val people = Vector(
  Person("Zach","Smith","zach@smith.com"),
  Person("Mary", "Add", "mary@add.com"),
  Person("Sally", "Taylor", "sally@taylor.com")
)

val sorted = people.sortBy(_.second)

sorted is "Vector(" +
  "Person(Mary,Add,mary@add.com), " +
  "Person(Zach,Smith,zach@smith.com), " +
  "Person(Sally,Taylor,sally@taylor.com))"
