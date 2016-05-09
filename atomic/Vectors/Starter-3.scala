// Starter Code for Exercise 3
// From "Vectors" atom
import com.atomicscala.AtomicTest._

val words = Vector("The", "dog", "visited", "the", "firehouse")
var sentence = "";
for (word <- words)
	sentence += word + " "
sentence.toString() is "The dog visited the firehouse "
