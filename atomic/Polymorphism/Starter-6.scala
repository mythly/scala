// Starter Code for Exercise 6
// From "Polymorphism" atom (2nd edition)
import com.atomicscala.AtomicTest._

trait Shape {
	def draw: String
}

class Ellipse extends Shape {
	override def draw = "Ellipse"
}

class Rectangle extends Shape {
	override def draw = "Rectangle"
}

class Circle extends Ellipse {
	override def draw = "Circle"
}

class Square extends Rectangle {
	override def draw = "Square"
}

class Drawing(shapes: Shape*) {
	val v = Vector(shapes: _*)
	def draw = v.map(_.draw)
	override def toString = draw.mkString(", ")
}

val drawing = new Drawing(
  new Rectangle, new Square,
  new Ellipse, new Circle)
drawing.draw is "Vector(Rectangle," +
  " Square, Ellipse, Circle)"
drawing is "Rectangle, Square," +
  " Ellipse, Circle"
