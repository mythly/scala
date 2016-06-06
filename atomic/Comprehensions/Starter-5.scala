// Starter Code for Exercise 5
// From "Comprehensions" atom
import com.atomicscala.AtomicTest._

case class Activity(date: String, activity: String)

def getDates(activity: String, activities: Vector[Activity]) = {
	for (a <- activities; if a.activity == activity)
		yield a.date
}

val activities = Vector(
  Activity("01-01", "Run"),
  Activity("01-03", "Ski"),
  Activity("01-04", "Run"),
  Activity("01-10", "Ski"),
  Activity("01-03", "Run"))

getDates("Ski", activities) is Vector("01-03", "01-10")
getDates("Run", activities) is Vector("01-01", "01-04", "01-03")
getDates("Bike", activities) is Vector()
