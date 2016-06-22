// Starter Code for Exercise 3
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
	val Skim, Lowfat = Value
}
import Milk._

object Syrup extends Enumeration {
	type Syrup = Value
	val Choc, NoFlavor = Value
}
import Syrup._

case class Coffee(shots: Shots, decaf: Decaf, where: Where) {	
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
	getCup()
	pourShots()	
	println(shots, decaf, where)
	println(result)
}

class Latte(shots: Shots, decaf: Decaf, where: Where, val milk: Milk) extends Coffee(shots, decaf, where) {
	override def toString = s"Latte($shots,$decaf,$where,$milk)"
}

class Mocha(shots: Shots, decaf: Decaf, where: Where, milk: Milk) extends Latte(shots, decaf, where, milk) {
	override def toString = s"Mocha($shots,$decaf,$where,$milk,$Choc)"
}

val mocha = new Mocha(Double,Caf,ToGo,Skim)
mocha is "Mocha(Double,Caf,ToGo,Skim,Choc)"
