// Starter Code for Exercise 1
// From "Defining Operators" atom
import com.atomicscala.AtomicTest._

class SimpleTime2(val hours: Int, val minutes: Int) {
	def -(obj: SimpleTime2) = {
		val t = if (totalMinutes > obj.totalMinutes) totalMinutes - obj.totalMinutes else 0;
		new SimpleTime2(t / 60, t % 60)
	}
	def totalMinutes = hours * 60 + minutes
}

val someT1 = new SimpleTime2(10, 30)
val someT2 = new SimpleTime2(9, 30)
val someST = someT1 - someT2
someST.hours is 1
someST.minutes is 0

val someST2 = new SimpleTime2(10, 30) - new SimpleTime2(9, 45)
someST2.hours is 0
someST2.minutes is 45
