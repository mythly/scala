// Starter Code for Exercise 2
// From "Pattern Matching" atom
import com.atomicscala.AtomicTest._

def oneOrTheOther(b: Boolean) = { 
	b match {
		case true => "True!"
		case false => "It's false"
	}
}

val v = Vector(1)
val v2 = Vector(3, 4)
oneOrTheOther(v == v.reverse) is "True!"
oneOrTheOther(v2 == v2.reverse) is "It's false"
