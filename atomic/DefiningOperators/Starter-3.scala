// Starter Code for Exercise 3
// From "Defining Operators" atom
import com.atomicscala.AtomicTest._

class FancyNumber2(a: Int) {
	def power(n: Int) = scala.math.pow(a.toDouble, n).toInt
	def ^(n: Int) = power(n)
}

val a2 = new FancyNumber2(2)
a2.^(3) is 8
val b2 = new FancyNumber2(10)
b2 ^ 2 is 100
