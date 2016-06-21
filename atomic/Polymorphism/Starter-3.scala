// Starter Code for Exercise 3
// From "Polymorphism" atom
import com.atomicscala.AtomicTest._
import com.atomicscala.Name

class Element extends Name {
  def interact(other:Element) =  s"$this interact $other"
  def draw = "Drawing the element"
}

class Inert extends Element {
	override def draw = s"Inert drawing!"
}

class Wall extends Inert {
	override def draw = "Don't draw on the wall!"
}

val wall = new Wall
wall.draw is "Don't draw on the wall!"
