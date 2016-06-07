// Starter Code for Exercise 4
// From "Tuples" atom
import com.atomicscala.AtomicTest._

def weather(temperature: Int, humidity: Int) = {	
	val heat = temperature match {
		case x if x > 80 => "Hot"
		case x if x < 50 => "Cold"
		case _ => "Temperate"
	}
	val moisture = humidity match {
		case x if x > 40 => if (temperature >= 50) "Humid" else "Damp"
		case _ => "Pleasant"
	}
	(heat, moisture)
}

val (heat1, moisture1) = weather(81, 45)
heat1 is "Hot"
moisture1 is "Humid"
val (heat2, moisture2) = weather(27, 55)
heat2 is "Cold"
moisture2 is "Damp"
