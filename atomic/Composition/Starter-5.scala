// Starter Code for Exercise 5
// From "Composition" Atom (2nd edition)
import com.atomicscala.AtomicTest._

trait Ability

case class Mobility(mobility: String) extends Ability

case class Vision(vision: String) extends Ability

case class Manipulator(manipulator: String) extends Ability

class Robot {	
	var mobilities = Vector[Mobility]()
	var visions = Vector[Vision]()
	var manipulators = Vector[Manipulator]()

	def addMobility(mobility: Mobility) = mobilities = mobilities :+ mobility
	def addVision(vision: Vision) = visions = visions :+ vision
	def addManipulator(manipulator: Manipulator) = manipulators = manipulators :+ manipulator

	override def toString = s"${mobilities.mkString(", ")} | ${visions.mkString(", ")} | ${manipulators.mkString(", ")}"
}

val bot = new Robot
bot.addMobility(
  Mobility("Propeller"))
bot.addMobility(
  Mobility("Legs"))
bot.addVision(
  Vision("UV"))
bot.addVision(Vision(
  "Visible Spectrum"))
bot.addManipulator(
  Manipulator("Magnet"))
bot.addManipulator(
  Manipulator("Claw"))

bot is "Mobility(Propeller)," +
" Mobility(Legs) | Vision(UV)," +
" Vision(Visible Spectrum) | " +
"Manipulator(Magnet)," +
" Manipulator(Claw)"
