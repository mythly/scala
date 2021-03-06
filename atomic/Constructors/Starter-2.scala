// Starter Code for Exercise 2
// From "Constructors" atom
import com.atomicscala.AtomicTest._

class Tea(decaf: Boolean = false, sugar: Boolean = false, milk: Boolean = false, name: String = "Earl Grey") {
	def describe = {
		var res = name
		if (decaf)
			res += " decaf"
		if (milk)
			res += " + milk"
		if (sugar)
			res += " + sugar"
		res
	}
	def calories = {
		var res = 0
		if (milk)
			res += 100
		if (sugar)
			res += 16
		res
	}
}

val tea = new Tea
tea.describe is "Earl Grey"
tea.calories is 0

val lemonZinger = new Tea(decaf=true, name="Lemon Zinger")
lemonZinger.describe is "Lemon Zinger decaf"
lemonZinger.calories is 0

val sweetGreen = new Tea(name="Jasmine Green", sugar=true)
sweetGreen.describe is "Jasmine Green + sugar"
sweetGreen.calories is 16

val teaLatte = new Tea(sugar=true, milk=true)
teaLatte.describe is "Earl Grey + milk + sugar"
teaLatte.calories is 116
