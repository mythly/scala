// Starter Code for Exercise 4
// From "More Conditionals" atom
import com.atomicscala.AtomicTest._

def isPalIgnoreSpecial(str: String) = { 
	var createdStr = ""
	for(c <- str.toLowerCase) {
	  // Convert to Int for comparison:
	  val theValue = c.toInt
	  if((97 to 120).contains(theValue)) {
	    createdStr += c
	  }
	  else if((48 to 57).contains(theValue)) {
	    createdStr += c
	  }
	}
	createdStr == createdStr.reverse
}


isPalIgnoreSpecial("Madam I'm adam") is true
isPalIgnoreSpecial("trees") is false
