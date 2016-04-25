// Starter Code for Exercise 4
// From "Fields" atom
import com.atomicscala.AtomicTest._

class Cup4 {
  var percentFull = 0
  val max = 100  
  def add(increase:Int):Int = {
    percentFull += increase
    if (percentFull > max) {
      percentFull = max
    }
    if (percentFull < 0) {
    	percentFull = 0
    }
    percentFull // Return this value
  }
  def set(newPercentFull: Int) = {
  	percentFull = newPercentFull
  }
  def get() = percentFull
}

val cup4 = new Cup4
cup4.set(56)
cup4.get() is 56
