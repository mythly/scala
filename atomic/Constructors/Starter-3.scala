// Starter Code for Exercise 3
// From "Constructors" atom
import com.atomicscala.AtomicTest._

class Tea2(val decaf: Boolean = false, val sugar: Boolean = false, val milk: Boolean = false, val name: String = "Earl Grey") {
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

val tea = new Tea2
tea.describe is "Earl Grey"
tea.calories is 0
tea.name is "Earl Grey"

val lemonZinger = new Tea2(decaf=true, name="Lemon Zinger")
lemonZinger.describe is "Lemon Zinger decaf"
lemonZinger.calories is 0
lemonZinger.decaf is true

val sweetGreen = new Tea2(name="Jasmine Green", sugar=true)
sweetGreen.describe is "Jasmine Green + sugar"
sweetGreen.calories is 16
sweetGreen.sugar is true

val teaLatte = new Tea2(sugar=true, milk=true)
teaLatte.describe is "Earl Grey + milk + sugar"
teaLatte.calories is 116
teaLatte.milk is true
