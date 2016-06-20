import com.atomicscala.AtomicTest._

abstract class A {
	def value: Int
}

case class B(x: Int) extends A {
	def value = x
}

val b = new B(2)
b.value is 2

abstract class Animal {
  def templateMethod =
    s"The $animal goes $sound"  
  // Abstract methods (no method body):
  def animal:String
  def sound:String
  def food: String
}

class Person extends Animal {
	def animal = "unknown"
	def sound = "Ha"
	def food = "anything"
	def animal(name: String) = name
}

val person = new Person
person.templateMethod is "The unknown goes Ha"
person.animal("foo") is "foo"
