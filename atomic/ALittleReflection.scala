import com.atomicscala.AtomicTest._

import reflect.runtime.currentMirror

trait Name {
	override def toString = {
		currentMirror.reflect(this).symbol.toString
		.replace('$', ' ').split(' ').last
	}
}

trait Name2 {
	override def toString = {
		currentMirror.reflect(this).symbol.toString		
	}
}

abstract class Base {
	override def toString: String
}

case class Person(val name: String)
val person = new Person("bar")
person is "Person(bar)"

case class Person2(name: String) extends Name
val person2 = new Person2("bar")
person2 is "Person2"

class Person3(val name: String) extends Name
val person3 = new Person3("bar")
person3 is "Person3"

class Person4(val name: String) extends Name2
val person4 = new Person4("bar")
person4 is "class $Person4"

val person5 = new Base with Name
person5 is "anon"