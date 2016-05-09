// Starter Code for Exercise 3
// From "More Conditionals" atom
import com.atomicscala.AtomicTest._

def isPalIgnoreCase(s: String) = { 
	val sl = s.toLowerCase
	sl == sl.reverse 
}

isPalIgnoreCase("Bob") is true
isPalIgnoreCase("DAD") is true
isPalIgnoreCase("Blob") is false
