// Starter Code for Exercise 4
// From "A Bit of Style" atom
import com.atomicscala.AtomicTest._

class Exclaim4(var s: String) {	
	var count = 0
	def parens() = {
		s += "!"
		count += 1
		s
	}
}

val e4 = new Exclaim4("counting")
e4.parens()
e4.parens()
e4.count is 2
