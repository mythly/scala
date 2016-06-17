// Starter Code for Exercise 2
// From "Overriding Methods" atom
import com.atomicscala.AtomicTest._

class GreatApe2(val weight:Double, val age:Int, val gender: String) {
	def myWords = Vector("Roar")
}
class Bonobo2(weight:Double, age:Int, gender: String) extends GreatApe2(weight, age, gender) {
	def myWords = Vector("Roar", "Hello")
}

val roaringApe = new GreatApe2(112, 9, "Male")
roaringApe.myWords is Vector("Roar")
val chattyBonobo = new Bonobo2(150, 14, "Female")
chattyBonobo.myWords is Vector("Roar", "Hello")
