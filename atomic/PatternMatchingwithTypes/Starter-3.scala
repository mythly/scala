// Starter Code for Exercise 3
// From "Pattern Matching with Types" atom
import com.atomicscala.AtomicTest._

def convertToSize2(x: Any): Int = {
	x match {
		case str: String => str.length
		case num: Int => num
		case num: Float => math.round(num)
		case person: Person => 1
		case _ => 0
	}
}

case class Person(name: String)

convertToSize2(45) is 45
convertToSize2("car") is 3
convertToSize2("truck") is 5
convertToSize2(Person("Joanna")) is 1
convertToSize2(45.6F) is 46
convertToSize2(Vector(1, 2, 3)) is 0
