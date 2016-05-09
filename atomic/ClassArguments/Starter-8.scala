// Starter Code for Exercise 8
// From "Class Arguments" atom
import com.atomicscala.AtomicTest._

class Cup2(var percentFull: Int) {  
  val max = 100
  def add(increase:Int):Int = {
    percentFull += increase
    if(percentFull > max) {
      percentFull = max
    }
    percentFull // Return this value
  }  
}

val cup2 = new Cup2(0)
cup2.add(45) is 45
cup2.add(-15) is 30
cup2.add(-50) is -20
cup2.percentFull = 70
cup2.percentFull is 70

class Cup5(var percentFull: Int) {  
  val max = 100
  val min = 0
  def add(increases:Int*):Int = {
  	for (increase <- increases) {
	    percentFull += increase
	    if (percentFull > max) {
	      percentFull = max
	    }
	    if (percentFull < min) {
	      percentFull = min
	    }
	}
    percentFull // Return this value
  }  
}


val cup5 = new Cup5(0)
cup5.add(20, 30, 50, 20, 10, -10, -40, 10, 50) is 100
cup5.add(10, 10, -10, 10, 90, 70, -70) is 30
