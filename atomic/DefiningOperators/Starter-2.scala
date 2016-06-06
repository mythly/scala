// Starter Code for Exercise 2
// From "Defining Operators" atom
import com.atomicscala.AtomicTest._

class FancyNumber1(a: Int) {
	def power(n: Int) = scala.math.pow(a.toDouble, n).toInt
}

val a1 = new FancyNumber1(2)
a1.power(3) is 8
val b1 = new FancyNumber1(10)
b1.power(2) is 100
