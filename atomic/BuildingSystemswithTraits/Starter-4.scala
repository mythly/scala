// Starter Code for Exercise 4
// From "Building Systems with Traits" atom
import com.atomicscala.AtomicTest._
import sodafountain._
import IceCream._

object Container extends Enumeration {
	type Container = Value
	val Pint, Quart, HalfGallon = Value
}
import Container._

case class TakeHome(container: Container, flavor: Flavor)

TakeHome(Pint, Chocolate) is
  "TakeHome(Pint,Chocolate)"
TakeHome(Quart, Strawberry) is
  "TakeHome(Quart,Strawberry)"
TakeHome(HalfGallon, Vanilla) is
  "TakeHome(HalfGallon,Vanilla)"
