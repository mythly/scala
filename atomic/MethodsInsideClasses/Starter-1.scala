// Starter Code for Exercise 1
// From "Methods Inside Classes" atom

class Sailboat {
	def raise(): String = "Sails raised"
	def lower(): String = "Sails lowered"
}

class Motorboat {
	def on(): String = "Motor on"
	def off(): String = "Motor off"
}

val sailboat = new Sailboat
val r1 = sailboat.raise()
assert(r1 == "Sails raised", "Expected Sails raised, Got " + r1)
val r2 = sailboat.lower()
assert(r2 == "Sails lowered", "Expected Sails lowered, Got " + r2)
val motorboat = new Motorboat
val s1 = motorboat.on()
assert(s1 == "Motor on", "Expected Motor on, Got " + s1)
val s2 = motorboat.off()
assert(s2 == "Motor off", "Expected Motor off, Got " + s2)
