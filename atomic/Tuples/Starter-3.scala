// Starter Code for Exercise 3
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

weather(81, 45) is ("Hot", "Humid")
weather(50, 45) is ("Temperate", "Humid")
