// Starter Code for Exercise 4
// From "Named & Default Arguments" atom
import com.atomicscala.AtomicTest._

class Planet(val name: String, val description: String, val moons: Int = 1) {
	def hasMoon = { moons > 0 }
}

val earth = new Planet(moons = 1, name = "Earth", description = "a hospitable planet")
earth.hasMoon is true
