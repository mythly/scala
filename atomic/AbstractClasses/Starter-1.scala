// Starter Code for Exercise 1
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

val duck = new Duck
duck.food is "plants"
val cow = new Cow
cow.food is "grass"
