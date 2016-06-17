// Starter Code for Exercise 4
// From "Base Class Initialization" atom
import com.atomicscala.AtomicTest._

class House(val address:String,
  val state:String, val zip:String) {
  def this(state:String, zip:String) =
    this("address?", state, zip)
  def this(zip:String) =
    this("address?", "state?", zip)
}

class VacationHouse(state:String, zip:String, val startMonth:Int, val endMonth:Int) extends House(state, zip) {
	override def toString = s"Rented house in MI for months of ${monthToString(startMonth)} through ${monthToString(endMonth)}."

	def monthToString(month: Int) = {
		month match {
			case 1 => "January"
			case 2 => "February"
			case 3 => "March"
			case 4 => "April"
			case 5 => "May"
			case 6 => "June"
			case 7 => "July"
			case 8 => "August"
			case 9 => "September"
			case 10 => "October"
			case 11 => "November"
			case 12 => "December"
    		case _ => "Unknown"
		}
	}
}

val v = new VacationHouse("MI", "49431", 6, 8)
v is "Rented house in MI for months of " +
  "June through August."
