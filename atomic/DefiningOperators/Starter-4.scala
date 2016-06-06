// Starter Code for Exercise 4
// From "Defining Operators" atom
import com.atomicscala.AtomicTest._

class FancyNumber3(a: Int) {
	def power(n: Int) = scala.math.pow(a.toDouble, n).toInt
	def ^(n: Int) = power(n)
	def **(n: Int) = power(n)
}

val a3 = new FancyNumber3(2)
a3.^(3) is 8
a3.**(3) is 8
val b3 = new FancyNumber3(10)
b3 ^ 2 is 100
b3 ** 2 is 100
