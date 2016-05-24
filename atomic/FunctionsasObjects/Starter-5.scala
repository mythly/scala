// Starter Code for Exercise 5
// From "Functions as Objects" atom
import com.atomicscala.AtomicTest._

var s = ""
val v = Vector(1, 5, 7, 8)
v.foreach(s += _ * 7 + " ")
s is "7 35 49 56 "
