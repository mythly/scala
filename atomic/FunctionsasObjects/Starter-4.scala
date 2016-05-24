// Starter Code for Exercise 4
// From "Functions as Objects" atom
import com.atomicscala.AtomicTest._

var s = ""
val v = Vector(1, 5, 7, 8)
val dogYears = (year:Int) => year * 7
v.foreach(s += dogYears(_) + " ")
s is "7 35 49 56 "
