// Starter Code for Exercise 2
// From "Maps" atom
import com.atomicscala.AtomicTest._

case class Name(firstName: String, lastName: String)
val m = Map("sally@taylor.com" -> Name("Sally","Taylor"))
m("sally@taylor.com") is Name("Sally", "Taylor")
