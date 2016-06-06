// Starter Code for Exercise 1
// From "A Bit of Style" atom
import com.atomicscala.AtomicTest._

class Exclaim(var s: String) {
	def noParens = s + "!"
	def parens() = {
		s += "!"
		s
	}
}

val e = new Exclaim("yes")
e.noParens is "yes!"
e.parens() is "yes!"
