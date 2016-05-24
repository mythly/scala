// Starter Code for Exercise 4
// From "Parameterized Types" atom
import com.atomicscala.AtomicTest._

def forecast(v: Int) = {
	v match {
		case 100 => "Sunny"
		case 80 => "Mostly Sunny"
		case 50 => "Partly Sunny"
		case 20 => "Mostly Cloudy"
		case 0 => "Cloudy"
		case _ => "Unknown"
	}
}

def historicalData(v: Vector[Int]): String = {
	var sunny = 0
	var mostlySunny = 0
	var mostlyCloudy = 0
	for (t <- v) {
		t match {
			case 100 => sunny += 1
			case 80 => mostlySunny += 1
			case 20 => mostlyCloudy += 1
		}
	}
	s"Sunny=$sunny, Mostly Sunny=$mostlySunny, Mostly Cloudy=$mostlyCloudy"
}

val weather = Vector(100, 80, 20, 100, 20)
historicalData(weather) is "Sunny=2, Mostly Sunny=1, Mostly Cloudy=2"
