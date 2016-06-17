// Starter Code for Exercise 3
// From "Base Class Initialization" atom
import com.atomicscala.AtomicTest._


class House(val address:String,
  val state:String, val zip:String) {
  def this(state:String, zip:String) =
    this("address?", state, zip)
  def this(zip:String) =
    this("address?", "state?", zip)
}

class Home(address: String, state: String, zip: String, val name: String, val heart: Boolean) extends House(address, state, zip) {	
	override def toString() = "Where the heart is"
}

val h = new Home("123 Main", "FL", "99999", "The retreat", true)
h.toString is "Where the heart is"
h.heart is true
