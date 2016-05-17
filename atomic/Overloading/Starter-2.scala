// Starter Code for Exercise 2
// From "Overloading" atom
import com.atomicscala.AtomicTest._

/*
def f(xs: Int*) = {
	var total = 0
	for (x <- xs)
		total += x
	total
}
*/

def f() = 0
def f(x: Int) = x
def f(x: Int, y: Int) = x + y
def f(x: Int, y: Int, z: Int) = x + y + z
def f(x: Int, y: Int, z: Int, u: Int) = x + y + z + u

f() is 0
f(1) is 1
f(1, 2) is 3
f(1, 2, 3) is 6
f(1, 2, 3, 4) is 10

class T {
	def f() = 0
	def f(x: Int) = x
	def f(x: Int, y: Int): Int = x + y
	//def f(x: Int, y: Int): Double = x + y
}

val t = new T()
t.f() is 0
t.f(1) is 1
t.f(1, 2) is 3
