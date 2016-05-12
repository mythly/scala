// Starter Code for Exercise 2
// From "Named & Default Arguments" atom
import com.atomicscala.AtomicTest._

class SimpleTime2(val hours: Int, val minutes: Int = 0)

val t2 = new SimpleTime2(hours=10)
t2.hours is 10
t2.minutes is 0
