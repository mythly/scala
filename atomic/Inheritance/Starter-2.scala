// Starter Code for Exercise 2
// From "Inheritance" atom
import com.atomicscala.AtomicTest._

class GreatApe {
	val vocalize = "Grrr!"
}

class Bonobo extends GreatApe
class Chimpanzee extends GreatApe
class BonoboB extends Bonobo

def says(ape: GreatApe) = s"says ${ape.vocalize}"

says(new GreatApe) is "says Grrr!"
says(new Bonobo) is "says Grrr!"
says(new Chimpanzee) is "says Grrr!"
says(new BonoboB) is "says Grrr!"
