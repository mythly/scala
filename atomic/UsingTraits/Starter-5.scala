// Starter Code for Exercise 5
// From "Using Traits" atom
import com.atomicscala.AtomicTest._

trait ArtPeriod {
	def period(year: Int) = {
		year match {
			case _ if year < 1300 => "Pre-Renaissance"
			case _ if year < 1600 => "Renaissance"
			case _ if year < 1700 => "Baroque"
			case _ if year < 1790 => "Late Baroque"
			case _ if year <= 1880 => "Romanticism"
			case _ if year <= 1970 => "Modern"
			case _ => "Contemporary"
		}
	}
}

class Painting(name: String, year: Int) extends ArtPeriod {
	def period: String = period(year)
}

val painting = new Painting("The Starry Night", 1889)
painting.period is "Modern"
