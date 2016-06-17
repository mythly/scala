// Starter Code for Exercise 5
// From "Base Class Initialization" atom
import com.atomicscala.AtomicTest._

class Trip(val origination: String, val destination: String, val startDate: String, val endDate: String) {
  override def toString = s"From $origination to $destination: $startDate to $endDate"
}

class AirplaneTrip(origination: String, destination: String, startDate: String, endDate: String, val movie: String) 
  extends Trip(origination, destination, startDate, endDate) {
    override def toString = s"On a flight from $origination to $destination, we watched $movie"
  }

class CarTrip(val localtions: Vector[String], startDate: String, endDate: String) 
  extends Trip(localtions.head, localtions.last, startDate, endDate)
  
val t = new Trip("Detroit","Houston", "5/1/2012","6/1/2012")
val a = new AirplaneTrip("Detroit", "London", "9/1/1939", "10/31/1939", "Superman")

val cities = Vector("Boston",
  "Albany","Buffalo","Cleveland",
  "Columbus","Indianapolis",
  "St. Louis", "Kansas City",
  "Denver", "Grand Junction",
  "Salt Lake City", "Las Vegas",
  "Bakersfield", "San Francisco")

val c = new CarTrip(cities, "6/1/2012", "7/1/2012")

c.origination is "Boston"
c.destination is "San Francisco"
c.startDate is "6/1/2012"

t is "From Detroit to Houston: 5/1/2012 to 6/1/2012"
a is "On a flight from Detroit to London, we watched Superman"
c is "From Boston to San Francisco: 6/1/2012 to 7/1/2012"