// Starter Code for Exercise 3
// From "Composition" Atom (2nd edition)
import com.atomicscala.AtomicTest._

case class Mobility(mobility: String)

case class Vision(vision: String)

case class Manipulator(manipulator: String)

class Robot(val mobilities: Vector[Mobility], val visions: Vector[Vision], val manipulators: Vector[Manipulator]) {  
  override def toString = s"${mobilities.mkString(", ")} | ${visions.mkString(", ")} | ${manipulators.mkString(", ")}"
}

val bot = new Robot(
  Vector(
    Mobility("Propeller"),
    Mobility("Legs")),
  Vector(
    Vision("UV"),
    Vision("Visible Spectrum")),
  Vector(
    Manipulator("Magnet"),
    Manipulator("Claw"))
)

bot is "Mobility(Propeller)," +
" Mobility(Legs) | Vision(UV)," +
" Vision(Visible Spectrum) | " +
"Manipulator(Magnet), " +
"Manipulator(Claw)"
