// Starter Code for Exercise 3
// From "Inheritance" atom
import com.atomicscala.AtomicTest._

class Cycle {
	val wheels = 2
	def ride = "Riding"
}

class Bicycle extends Cycle

val c = new Cycle
c.ride is "Riding"
val b = new Bicycle
b.ride is "Riding"
b.wheels is 2
