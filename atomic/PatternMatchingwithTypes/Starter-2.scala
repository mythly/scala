// Starter Code for Exercise 2
// From "Pattern Matching with Types" atom
import com.atomicscala.AtomicTest._

def convertToSize(x: Any) = {
	x match {
		case str: String => str.length
		case num: Int => num
		case num: Float => num
		case person: Person => 1
		case _ => 0
	}
}

case class Person(name: String)

convertToSize(45) is 45
convertToSize("car") is 3
convertToSize("truck") is 5
convertToSize(Person("Joanna")) is 1
convertToSize(45.6F) is 45.6F
convertToSize(Vector(1, 2, 3)) is 0
