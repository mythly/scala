// Starter Code for Exercise 3
// From "Traits" atom
import com.atomicscala.AtomicTest._

trait BatteryPower {
	def monitor(power: Int) = {
		power match {
			case _ if power >= 40 => "green"
			case _ if power >= 20 => "yellow"
			case _ => "red"
		}
	}
}

class Toy

val toy2 = new Toy with BatteryPower
toy2.monitor(50) is "green"
