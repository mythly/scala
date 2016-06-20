// Starter Code for Exercise 3
// From "Enumerations" atom
import com.atomicscala.AtomicTest._

object MonthName extends Enumeration {
	type MonthName = Value
	val January = Value(1)
	val February, March, April, May, June, July, August, September, October, November, December = Value
}

import MonthName._
def monthNumber(monthName: MonthName) = monthName.id

July is "July"
monthNumber(July) is 7
