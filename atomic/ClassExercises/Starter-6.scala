// Starter Code for Exercise 6
// From "Class Exercises" atom
import com.atomicscala.AtomicTest._

class SimpleTimeAux(val hours: Int, val minutes: Int) {
	def this(hours: Int) = this(hours, 0)
	def subtract(obj: SimpleTimeAux) = {
		val t: Int = if (totalMinutes > obj.totalMinutes) totalMinutes - obj.totalMinutes else 0;
		new SimpleTimeAux(t / 60, t % 60)
	}
	def totalMinutes = hours * 60 + minutes
}

val auxT1 = new SimpleTimeAux(10, 5)
val auxT2 = new SimpleTimeAux(6)
val auxST = auxT1.subtract(auxT2)
auxST.hours is 4
auxST.minutes is 5
val auxST2= new SimpleTimeAux(12).subtract(new SimpleTimeAux(9, 45))
auxST2.hours is 2
auxST2.minutes is 15
