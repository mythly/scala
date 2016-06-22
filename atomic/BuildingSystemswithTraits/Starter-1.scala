// Starter Code for Exercise 1
// From "Building Systems with Traits" atom
import com.atomicscala.AtomicTest._

object Shots extends Enumeration {
	type Shots = Value
	val Single, Double = Value
}
import Shots._

object Decaf extends Enumeration {
	type Decaf = Value
	val Caf, HalfCaf = Value
}
import Decaf._

object Where extends Enumeration {
	type Where = Value
	val Here, ToGo = Value
}
import Where._

object Milk extends Enumeration {
	type Milk = Value
	val Skim, NoMilk = Value
}
import Milk._

object Syrup extends Enumeration {
	type Syrup = Value
	val Choc, NoFlavor = Value
}
import Syrup._

case class Coffee(shots: Shots, decaf: Decaf, where: Where, milk: Milk, syrup: Syrup) {	
	var result = ""
	def getCup():Unit = {
		result += s"${where}Cup "
	}    
	def pourShots():Unit = {    
		if(decaf == HalfCaf)
			result += "decaf shot "
		else
			result += "shot "
	}
	def addMilk():Unit = {
		if(milk != NoMilk)
			result += "milk "
	}
	def addSyrup():Unit = {
		if (syrup != NoFlavor)
			result += syrup
	}
	getCup()
	pourShots()
	addMilk()
	addSyrup()	
	println(shots, decaf, where, milk, syrup)
	println(result)
}

Coffee(Single, Caf, Here, Skim, Choc) is
  "Coffee(Single,Caf,Here,Skim,Choc)"
Coffee(Double, Caf, Here, NoMilk, NoFlavor) is
  "Coffee(Double,Caf,Here,NoMilk,NoFlavor)"
Coffee(Double, HalfCaf, ToGo, Skim, Choc) is
  "Coffee(Double,HalfCaf,ToGo,Skim,Choc)"
