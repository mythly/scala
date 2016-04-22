// PythagoreanTheorem.scala
package com.atomicscala.pythagorean

class RightTriangle {
  def hypotenuse(a:Double, b:Double):Double = {
    Math.sqrt(a*a + b*b)
  }
  def area(a:Double, b:Double):Double = {
    a*b/2
  }
  def area(side: Double): Double = {
  		side * side / 2
  }
}

class A {
	println("A")
}

class B {
	println("B")
}

class C {
	println("C")
}
