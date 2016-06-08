// Starter Code for Exercise 1
// From "Inheritance" atom
import com.atomicscala.AtomicTest._

class GreatApe {
	val vocalize = "Grrr!"
}

class Bonobo extends GreatApe
class Chimpanzee extends GreatApe

val ape1 = new GreatApe
ape1.vocalize is "Grrr!"
val ape2 = new Bonobo
ape2.vocalize is "Grrr!"
val ape3 = new Chimpanzee
ape3.vocalize is "Grrr!"
