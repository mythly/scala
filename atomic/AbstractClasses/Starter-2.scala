// Starter Code for Exercise 2
// From "Abstract Classes" atom
import com.atomicscala.AtomicTest._

abstract class Animal {
  def templateMethod =
    s"The $animal goes $sound"  
  // Abstract methods (no method body):
  def animal:String
  def sound:String
  def food: String
}

// Error -- abstract class
// cannot be instantiated:
// val a = new Animal

class Duck extends Animal {
  def animal = "Duck"  
  // "override" is optional here:
  override def sound = "Quack"
  def food = "plants"
}

class Cow extends Animal {
  def animal = "Cow"
  def sound = "Moo"
  def food = "grass"
}

class Chicken extends Animal {
	def animal = "Chicken"
	def sound = "Ge"
	def food = "insects"
}

class Pig extends Animal {
	def animal = "Pig"
	def sound = "Meng"
	def food = "anything"
}

val chicken = new Chicken
chicken.food is "insects"
val pig = new Pig
pig.food is "anything"
