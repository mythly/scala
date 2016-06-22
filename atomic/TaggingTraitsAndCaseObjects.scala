// Starter Code for Exercise 2
// From "Tagging Traits & Case Objects" atom
import com.atomicscala.AtomicTest._

sealed trait Color
case object Red extends Color
case object Green extends Color
case object Blue extends Color
case object Purple extends Color
object Color {
  val values = Vector(Red, Green, Blue, Purple, Red)
}

def display(c:Color) = c match {
  case Red => s"It's $c"
  case Green => s"It's $c"
  case Blue => s"It's $c"
}

//Color.values.map(display) is "Vector(It's Red, It's Green, It's Blue)"

object EnumColor extends Enumeration {
	type Enumeration = Value
	val Red, Blue, Green = Value
	//val Red = Value
}

EnumColor.Red is "Red"
EnumColor.Blue is "Blue"
EnumColor.Green is "Green"
