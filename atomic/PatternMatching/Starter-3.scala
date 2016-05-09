// Starter Code for Exercise 3
// From "Pattern Matching" atom
import com.atomicscala.AtomicTest._

def checkTruth(a: Boolean, b: Boolean) = {
	(a, b) match {
		case (true, true) => "Both are true"
		case (true, false) => "First: true, second: false"
		case (false, true) => "First: false, second: true"
		case (false, false) => "Both are false"
	}
}

checkTruth(true || false, true) is "Both are true"
checkTruth(1 > 0 && -1 < 0, 1 == 2) is "First: true, second: false"
checkTruth(1 >= 2, 1 >= 1) is "First: false, second: true"
checkTruth(true && false, false && true) is "Both are false"
