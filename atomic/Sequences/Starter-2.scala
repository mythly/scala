// Starter Code for Exercise 2
// From "Sequences" atom
import com.atomicscala.AtomicTest._

case class Person(first: String, second: String, email: String) {
	def fullName = s"$first $second"
}

val person1 = Person("a", "b", "1@2.com")
val person2 = Person("c", "d", "3@4.com")
val person3 = Person("e", "f", "5@6.com")
val people = Vector(person1, person2, person3)

people.size is 3
