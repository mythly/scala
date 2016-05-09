// Starter Code for Exercise 4
// From "For Loops" atom
import com.atomicscala.AtomicTest._

var totalEvens = 0
for (i <- Range(0, 10, 2).inclusive)
	totalEvens += i;
totalEvens is 30
