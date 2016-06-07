// Starter Code for Exercise 2
// From "Automatic String Conversion" atom
import com.atomicscala.AtomicTest._

case class Cycle(n: Int) {
	override def toString = {
		n match {
			case 1 => "Unicycle"
			case 2 => "Bicycle"
			case _ => s"Cycle with $n wheels"
		}
	}
}

val c1 = Cycle(1)
c1 is "Unicycle"
val c2 = Cycle(2)
c2 is "Bicycle"
val cn = Cycle(5)
cn is "Cycle with 5 wheels"
