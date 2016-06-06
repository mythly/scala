// Starter Code for Exercise 3
// From "Pattern Matching with Case Classes" atom
import com.atomicscala.AtomicTest._

case class Passenger(
  first:String, last:String)
case class Train(
  travelers:Vector[Passenger],
  line:String)
case class Bus(
  passengers:Vector[Passenger],
  capacity:Int)
case class Plane(
  passengers:Vector[Passenger],
  name:String)

def travel2(transport:Any):String = {
  transport match {
    case Train(travelers, line) =>
      s"Train line $line $travelers"
    case Bus(travelers, seats) =>
      s"Bus size $seats $travelers"    
    case Plane(travelers, name) =>
      s"Plane $name $travelers"
    case Passenger(first, _) => s"$first is walking"    
    case what => s"$what is in limbo!"
  }
}

case class Kitten(name:String)

travel2(Kitten("Kitty")) is "Kitten(Kitty) is in limbo!"
