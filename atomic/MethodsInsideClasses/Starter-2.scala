// Starter Code for Exercise 2
// From "Methods Inside Classes" atom

class Flare {
	def light = "Flare used!"
}

val flare = new Flare
val f1 = flare.light
assert(f1 == "Flare used!", "Expected Flare used!, Got " + f1)
