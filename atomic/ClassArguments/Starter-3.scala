// Starter Code for Exercise 3
// From "Class Arguments" atom
import com.atomicscala.AtomicTest._

class FlexibleFamily(mom: String, dad: String, kids: String*) {
	def familySize() = 2 + kids.size
}

val familyNoKids = new FlexibleFamily("Mom", "Dad")
familyNoKids.familySize() is 2
