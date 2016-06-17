// GreatApe2.scala
import com.atomicscala.AtomicTest._

class GreatApe(val weight:Double, val age:Int, val gender: String) {
	def print = println("This is GreatApe")
}
class Bonobo(weight:Double, age:Int, gender: String) extends GreatApe(weight, age, gender) {
	print
}
class Chimpanzee(weight:Double, age:Int, gender: String) extends GreatApe(weight, age, gender)
class BonoboB(weight:Double, age:Int, gender: String) extends Bonobo(weight, age, gender)
class BonoboC(weight:Double, age:Int, gender: String) extends BonoboB(weight, age, gender)

def display(ape:GreatApe) = s"weight: ${ape.weight} age: ${ape.age} gender: ${ape.gender}"

display(new GreatApe(100, 12, "Male")) is "weight: 100.0 age: 12 gender: Male"
display(new Bonobo(100, 12, "Female")) is "weight: 100.0 age: 12 gender: Female"
display(new Chimpanzee(100, 12, "Male")) is "weight: 100.0 age: 12 gender: Male"
display(new BonoboB(100, 12, "Male")) is "weight: 100.0 age: 12 gender: Male"
display(new BonoboC(150, 18, "Female")) is "weight: 150.0 age: 18 gender: Female"
