// Starter Code for Exercise 5
// From "For Loops" atom
import com.atomicscala.AtomicTest._

var evens = 0
var odds = 0
for (i <- 1 to 10)
	if (i % 2 == 0)
		evens += i;
	else
		odds += i;
evens is 30
odds is 25
(evens + odds) is 55
