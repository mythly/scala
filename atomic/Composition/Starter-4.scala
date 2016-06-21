// Starter Code for Exercise 4
// From "Composition" Atom (2nd edition)
import com.atomicscala.AtomicTest._

trait Ability

case class Mobility(mobility: String) extends Ability

case class Vision(vision: String) extends Ability

case class Manipulator(manipulator: String) extends Ability

class Robot(val abilities: Vector[Ability]) {  
  override def toString = abilities.mkString(", ")
}

val bot = new Robot(
  Vector(Mobility("Propeller"),
    Mobility("Legs"),
    Vision("UV"),
    Vision("Visible Spectrum"),
    Manipulator("Magnet"),
    Manipulator("Claw"))
)

bot is "Mobility(Propeller), " +
"Mobility(Legs), Vision(UV), " +
"Vision(Visible Spectrum), " +
"Manipulator(Magnet), " +
"Manipulator(Claw)"
