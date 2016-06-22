// Starter Code for Exercise 3
// From "Maps" atom
import com.atomicscala.AtomicTest._

case class Name(firstName: String, lastName: String)
val m = Map("sally@taylor.com" -> Name("Sally","Taylor"))
val m2 = m + ("jiminy@cricket.com" -> Name("Jiminy", "Cricket"))
m2("jiminy@cricket.com") is Name("Jiminy", "Cricket")
m2("sally@taylor.com") is Name("Sally", "Taylor")
