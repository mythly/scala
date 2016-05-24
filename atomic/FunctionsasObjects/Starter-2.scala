// Starter Code for Exercise 2
// From "Functions as Objects" atom
import com.atomicscala.AtomicTest._

val v = Vector(1, 2, 3, 4)
var str = ""
v.foreach(str += _ + ",")

str is "1,2,3,4,"
