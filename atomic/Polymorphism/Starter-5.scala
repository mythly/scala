// Starter Code for Exercise 5
// From "Polymorphism" atom (2nd edition)
import com.atomicscala.AtomicTest._

class Seed

class Tomato extends Seed {
	override def toString = "Tomato"
}

class Corn extends Seed {
	override def toString = "Corn"
}

class Zucchini extends Seed {
	override def toString = "Zucchini"
}

class Garden(seeds: Seed*) {
	val v = Vector(seeds: _*)
	override def toString = v.mkString(", ")
}

val garden = new Garden(new Tomato, new Corn, new Zucchini)
garden is "Tomato, Corn, Zucchini"
