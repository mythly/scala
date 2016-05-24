// Starter Code for Exercise 6
// From "Case Classes" atom
import com.atomicscala.AtomicTest._

case class SimpleTimeDefault(hours: Int, minutes: Int = 0) {
	def subtract(obj: SimpleTimeDefault) = {
		val t: Int = if (totalMinutes > obj.totalMinutes) totalMinutes - obj.totalMinutes else 0;
		new SimpleTimeDefault(t / 60, t % 60)
	}
	def totalMinutes = hours * 60 + minutes
}

val anotherT1 = new SimpleTimeDefault(10, 30)
val anotherT2 = new SimpleTimeDefault(9)
val anotherST = anotherT1.subtract(anotherT2)

anotherST.hours is 1
anotherST.minutes is 30

val anotherST2 =
  new SimpleTimeDefault(10).subtract(new SimpleTimeDefault(9, 45))

anotherST2.hours is 0
anotherST2.minutes is 15
