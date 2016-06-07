// Starter Code for Exercise 3
// From "Automatic String Conversion" atom
import com.atomicscala.AtomicTest._

case class Cycle(n: Int) {
	override def toString = {
		n match {
			case 1 => "Unicycle"
			case 2 => "Bicycle"
			case _ if n <= 0 => "That's not a cycle!"
			case _  => s"Cycle with $n wheels"
		}
	}
}


Cycle(-2) is "That's not a cycle!"
