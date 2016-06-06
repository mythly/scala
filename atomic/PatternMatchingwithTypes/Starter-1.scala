// Starter Code for Exercise 1
// From "Pattern Matching with Types" atom
import com.atomicscala.AtomicTest._

def plus1(x: Any) = {
	x match {
		case str: String => str + 's'
		case num: Int => num + 1
		case person: Person => person + " + guest"
		case _ => "others"
	}
}

case class Person(name: String)

plus1("car") is "cars"
plus1(67) is 68
plus1(Person("Joanna")) is "Person(Joanna) + guest"
