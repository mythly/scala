// Starter Code for Exercise 3
// From "Comprehensions" atom
import com.atomicscala.AtomicTest._

// Here's the original yielding3:
def yielding3(v:Vector[Int]):Vector[Int]={
	var result = Vector[Int]()
	for (n <- v; if n < 10; if n % 2 != 0)	
		result = result :+ n * 10 + 2
	result  
}

val v = Vector(1,2,3,5,6,7,8,10,13,14,17)
yielding3(v) is Vector(12, 32, 52, 72)
