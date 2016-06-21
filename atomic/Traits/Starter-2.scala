// Starter Code for Exercise 2
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

class BatteryPoweredToy extends Toy with BatteryPower

val toy = new BatteryPoweredToy
toy.monitor(50) is "green"
