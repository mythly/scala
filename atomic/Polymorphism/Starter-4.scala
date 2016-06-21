// Starter Code for Exercise 4
// From "Polymorphism" atom
import com.atomicscala.AtomicTest._
import com.atomicscala.Name

class Element extends Name {
  def interact(other:Element) =
    s"$this interact $other"
}

class Character(val player:String="None") extends Element
class Dragon(name: String) extends Character(name)
val d = new Dragon("Puff")
d.player is "Puff"
