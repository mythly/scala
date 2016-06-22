// Starter Code for Exercise 4
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

// From wikipedia.org/wiki/Art_periods
// Pre-Renaissance: before 1300
// Renaissance: 1300-1599
// Baroque: 1600-1699
// Late Baroque: 1700-1789
// Romanticism: 1790-1880
// Modern: 1881-1970
// Contemporary: after 1971
val art = new Object with ArtPeriod
art.period(1400) is "Renaissance"
art.period(1650) is "Baroque"
art.period(1279) is "Pre-Renaissance"
