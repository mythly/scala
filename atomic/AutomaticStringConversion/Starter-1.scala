// Starter Code for Exercise 1
// From "Automatic String Conversion" atom
import com.atomicscala.AtomicTest._

case class Bicycle(v: Int) {
	override def toString = s"Bicycle built for $v"
}

val forTwo = Bicycle(2)
forTwo is "Bicycle built for 2"
