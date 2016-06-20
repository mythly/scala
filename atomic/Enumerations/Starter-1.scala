// Starter Code for Exercise 1
// From "Enumerations" atom
import com.atomicscala.AtomicTest._

object MonthName extends Enumeration {
	type MonthName = Value
	val January, February, March, April, May, June, July, August, September, October, November, December = Value
}

MonthName.February is "February"
MonthName.February.id is 1
