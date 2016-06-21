// Starter Code for Exercise 2
// From "Composition" Atom (2nd edition)
import com.atomicscala.AtomicTest._

case class Mobility(mobility: String)

case class Vision(vision: String)

case class Manipulator(manipulator: String)

class Robot(val mobility: Mobility, val vision: Vision, val manipulator: Manipulator) {  
  override def toString = s"$mobility, $vision, $manipulator"
}

val walker = new Robot(
  Mobility("Legs"),
  Vision("Visible Spectrum"),
  Manipulator("Magnet"))
walker is "Mobility(Legs), " +
  "Vision(Visible Spectrum)," +
  " Manipulator(Magnet)"
val crawler = new Robot(
  Mobility("Treads"),
  Vision("Infrared"),
  Manipulator("Claw"))
crawler is "Mobility(Treads)," +
  " Vision(Infrared), " +
  "Manipulator(Claw)"
val arial = new Robot(
  Mobility("Propeller"),
  Vision("UV"),
  Manipulator("None"))
arial is "Mobility(Propeller)," +
  " Vision(UV), Manipulator(None)"
