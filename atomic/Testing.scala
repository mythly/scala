// Starter Code for Exercise 5
// From "Testing" atom
import com.atomicscala.AtomicTest._

def squareArea(x: Double): Double = {
  x * x
}

def rectangleArea(x: Double, y: Double): Double = {
  x * y
}

def trapezoidArea(x: Double, y: Double, h: Double): Double = {
  h/2 * (x + y)
}

// needs solution and tests
squareArea(1) is 1
squareArea(2) is 4
squareArea(5) is 25
rectangleArea(2, 2) is 4
rectangleArea(5, 4) is 20
trapezoidArea(2, 2, 4) is 8
trapezoidArea(3, 4, 1) is 3.5

val v1 = 20
val v2 = 10
v1 is v2
val v3 = 10
val v4 = 10
v3 is v4
v2 is v3
val v5 = "10"
v2 is v5
