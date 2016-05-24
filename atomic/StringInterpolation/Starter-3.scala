// Starter Code for Exercise 3
// From "String Interpolation" atom
import com.atomicscala.AtomicTest._

class GardenGnome(val height:Double,
  val weight:Double, val happy:Boolean) {
  //println("Inside primary constructor")
  var painted = true
  def magic(level:Int):String = {
    "Poof! " + level
  }
  def this(height:Double) {
    this(height, 100.0, true)
  }
  def this(name:String) = {
    this(15.0)
    //painted is true
  }
  def show():String = {
    s"height: $height weight: $weight happy: $happy painted: $painted"
  }
}

val gnome = new GardenGnome(20.0, 110.0, false)
gnome.show() is "height: 20.0 weight: 110.0 happy: false painted: true"
val bob = new GardenGnome("Bob")
bob.show() is "height: 15.0 weight: 100.0 happy: true painted: true"
