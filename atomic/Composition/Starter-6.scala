// Starter Code for Exercise 6
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

	def +(mobility: Mobility) = {
		mobilities = mobilities :+ mobility
		this
	}
	def +(vision: Vision) = {
		visions = visions :+ vision
		this
	}
	def +(manipulator: Manipulator) = {
		manipulators = manipulators :+ manipulator
		this
	}

	override def toString = s"${mobilities.mkString(", ")} | ${visions.mkString(", ")} | ${manipulators.mkString(", ")}"
}


val bot = new Robot +
  Mobility("Propeller") +
  Mobility("Legs") +
  Vision("UV") +
  Vision("Visible Spectrum") +
  Manipulator("Magnet") +
  Manipulator("Claw")

bot is "Mobility(Propeller)," +
" Mobility(Legs) | Vision(UV)," +
" Vision(Visible Spectrum) |" +
" Manipulator(Magnet)," +
" Manipulator(Claw)"
