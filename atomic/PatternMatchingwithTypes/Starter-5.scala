// Starter Code for Exercise 5
// From "Pattern Matching with Types" atom
import com.atomicscala.AtomicTest._

def forecast(v: Int) = {	
	v match {
		case v if v > 80 => "Sunny"
		case v if v > 50 => "Mostly Sunny"
		case v if v > 20 => "Partly Sunny"
		case v if v > 0 => "Mostly Cloudy"
		case 0 => "Cloudy"
		case _ => "Unknown"
	}
}

forecast(100) is "Sunny"
forecast(81) is "Sunny"
forecast(80) is "Mostly Sunny"
forecast(51) is "Mostly Sunny"
forecast(50) is "Partly Sunny"
forecast(21) is "Partly Sunny"
forecast(20) is "Mostly Cloudy"
forecast(1) is "Mostly Cloudy"
forecast(0) is "Cloudy"
forecast(-1) is "Unknown"
