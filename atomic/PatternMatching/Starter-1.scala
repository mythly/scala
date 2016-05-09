// Starter Code for Exercise 1
// From "Pattern Matching" atom
import com.atomicscala.AtomicTest._

def matchColor(color: String) = {
	if (color == "blue")
		"BLUE"
	else
		"UNKNOWN COLOR: " + color
}

matchColor("white") is "UNKNOWN COLOR: white"
matchColor("blue") is "BLUE"
