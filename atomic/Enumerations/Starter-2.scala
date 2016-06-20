// Starter Code for Exercise 2
// From "Enumerations" atom
import com.atomicscala.AtomicTest._

object MonthName2 extends Enumeration {
	type MonthName = Value
	val January = Value(1)
	val February, March, April, May, June, July, August, September, October, November, December = Value
}

MonthName2.February is "February"
MonthName2.February.id is 2
MonthName2.December.id is 12
MonthName2.July.id is 7
