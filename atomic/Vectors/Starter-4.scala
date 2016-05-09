// Starter Code for Exercise 4
// From "Vectors" atom
import com.atomicscala.AtomicTest._

val words = Vector("The", "dog", "visited", "the", "firehouse")
var theString = "";
for (word <- words)
	theString += word + " "
theString = theString.replace("firehouse ", "firehouse!")
theString is "The dog visited the firehouse!"
