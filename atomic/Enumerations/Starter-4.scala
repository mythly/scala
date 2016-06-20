// Starter Code for Exercise 4
// From "Enumerations" atom
import com.atomicscala.AtomicTest._

object MonthName extends Enumeration {
	type MonthName = Value
	val January, February, March, April, May, June, July, August, September, October, November, December = Value
}

import MonthName._

def season(monthName: MonthName) = {
	monthName match {
		case December | January | February => "Winter"
		case March | April | May => "Spring"
		case June | July | August => "Summer"
		case September | October | November => "Autumn"
	}
}

season(January) is "Winter"
season(April) is "Spring"
season(August) is "Summer"
season(November) is "Autumn"
