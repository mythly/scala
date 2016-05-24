// Starter Code for Exercise 1
// From "map & reduce" atom
import com.atomicscala.AtomicTest._
import scala.collection.immutable.VectorBuilder

val v = Vector(1, 2, 3, 4)
v.map(_ * 11 + 10) is Vector(21, 32, 43, 54)
//v.foreach(_ * 11 + 10) is Vector(21, 32, 43, 54)

val v2 = new VectorBuilder[Int]()
for (t <- v)
	v2 += t * 11 + 10
v2.result is Vector(21, 32, 43, 54)

val v3 = Vector(1, 10, 100, 1000)
v3.reduce((sum, n) => sum + n) is 1111

var sum = 0
for (t <- v3)
	sum += t
sum is 1111

