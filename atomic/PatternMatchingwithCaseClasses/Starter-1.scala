// Starter Code for Exercise 1
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

def travel(transport:Any):String = {
  transport match {
    case Train(travelers, line) =>
      s"Train line $line $travelers"
    case Bus(travelers, seats) =>
      s"Bus size $seats $travelers"    
    case Plane(travelers, name) =>
      s"Plane $name $travelers"
    case Passenger => "Walking along"
    case what => s"$what is in limbo!"
  }
}

val travelers = Vector(
  Passenger("Harvey", "Rabbit"),
  Passenger("Dorothy", "Gale"))

val trip = Vector(
  Train(travelers, "Reading"),
  Bus(travelers, 100))

travel(trip(0)) is "Train line Reading " +
  "Vector(Passenger(Harvey,Rabbit), " +
  "Passenger(Dorothy,Gale))"
travel(trip(1)) is "Bus size 100 " +
  "Vector(Passenger(Harvey,Rabbit), " +
  "Passenger(Dorothy,Gale))"

val trip2 = Vector(
  Train(travelers, "Reading"),
  Plane(travelers, "B757"),
  Bus(travelers, 100))

travel(trip2(1)) is "Plane B757 Vector(Passenger(Harvey,Rabbit), Passenger(Dorothy,Gale))"
