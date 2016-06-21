// Starter Code for Exercise 1
// From "Traits" atom
import com.atomicscala.AtomicTest._

trait BatteryPower {
	def monitor(power: Int): String
}

class EnergySource extends BatteryPower {
	def monitor(power: Int) = {
		power match {
			case _ if power >= 40 => "green"
			case _ if power >= 20 => "yellow"
			case _ => "red"
		}
	}
}

class Battery extends EnergySource with BatteryPower

object Battery {
	def main(args: Array[String]) {
		val battery = new Battery
		battery.monitor(80) is "green"
		battery.monitor(30) is "yellow"
		battery.monitor(10) is "red"
		args.foreach(arg => println(battery.monitor(arg.toInt)))	
	}
}

