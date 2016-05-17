// Starter Code for Exercise 4
// From "Auxiliary Constructors" atom
import com.atomicscala.AtomicTest._

class ClothesWasher3(val model: String, val capacity: Double) {
	def this(model: String) = this(model, 10.0)
	def this(capacity: Double) = this("a", capacity)	
	def wash() = "Simple wash"
	def wash(bleach: Integer, fabric: Integer) = "Wash used " + bleach + " bleach and " + fabric +" fabric softener"
}

val washer = new ClothesWasher3("LG 100", 3.6)
washer.wash(2, 1) is "Wash used 2 bleach and 1 fabric softener"
washer.wash() is "Simple wash"
