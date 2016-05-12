// Starter Code for Exercise 3
// From "Named & Default Arguments" atom
import com.atomicscala.AtomicTest._

class Planet(val name: String, val description: String, val moons: Int = 1) {
	def hasMoon = { moons > 0 }
}

val p = new Planet(name = "Mercury", description = "small and hot planet", moons = 0)
p.hasMoon is false
