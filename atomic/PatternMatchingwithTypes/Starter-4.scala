// Starter Code for Exercise 4
// From "Pattern Matching with Types" atom
import com.atomicscala.AtomicTest._

def quantify(x: Any) = {
	x match {
		case i: Int if (i < 100) => "small"
		case i: Int if (i <= 1000) => "medium"
		case i: Int => "large"
		case d: Double if (d < 100) => "small"
		case d: Double if (d <= 1000) => "medium"
		case d: Double => "large"
		case _ => ""
	}	
}

quantify(100) is "medium"
quantify(20.56) is "small"
quantify(100000) is "large"
quantify(-15999) is "small"
