// Starter Code for Exercise 1
// From "Constructors" atom
import com.atomicscala.AtomicTest._

class Coffee(val shots:Int = 2,
             val decaf:Int = 0,
             val milk:Boolean = false,
             val toGo:Boolean = false,
             val syrup:String = "") {
  var result = ""
  val caf: Int = shots - decaf  
  println(shots, decaf, milk, toGo, syrup)
  getCup()
  pourShots()
  addMilk()
  addSyrup()
  println(result)

  def getCup():Unit = {
    if(toGo)
      result += "ToGoCup "
    else
      result += "HereCup "
  }
  def pourShots():Unit = {    
    result += "decaf shot " * decaf      
    result += "shot " * caf
  }
  def addMilk():Unit = {
    if(milk)
      result += "milk "
  }
  def addSyrup():Unit = {
    result += syrup
  }  
}

val doubleHalfCaf = new Coffee(shots=2, decaf=1)
val tripleHalfCaf = new Coffee(shots=3, decaf=2)

doubleHalfCaf.decaf is 1
doubleHalfCaf.caf is 1
doubleHalfCaf.shots is 2
tripleHalfCaf.decaf is 2
tripleHalfCaf.caf is 1
tripleHalfCaf.shots is 3
