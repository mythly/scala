// Constraint.scala
import com.atomicscala.AtomicTest._

class WithF {
  def f(n:Int) = n * 11
}

def callF[T <: WithF](t: T) = t.f(_)
  
callF(new WithF)(2) is 22

callF(new WithF {override def f(n:Int) = n * 7})(2) is 14

class Base {
	override def toString = "Base"
}
class Derived extends Base {
	override def toString = "Derived"
}
class Most extends Derived {
	override def toString = "Most"
}

def fBase[T <: Base](obj: T) = obj
def fDerived[T <: Derived] (obj: T) = obj
def fMost[T <: Most](obj: T) = obj

val base = new Base
val derived = new Derived
val most = new Most

fBase(base) is "Base"
fBase(derived) is "Derived"
fBase(most) is "Most"
//fDerived(base) is "Base"
fDerived(derived) is "Derived"
fDerived(most) is "Most"
//fMost(base) is "Base"
//fMost(derived) is "Derived"
fMost(most) is "Most"
