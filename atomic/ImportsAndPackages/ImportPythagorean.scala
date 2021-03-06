// ImportPythagorean.scala
import com.atomicscala.pythagorean.{ RightTriangle, A, B, C => D }

val rt = new RightTriangle
println(rt.hypotenuse(3,4))
println(rt.area(3,4))
assert(rt.hypotenuse(3,4) == 5)
assert(rt.area(3,4) == 6)

val a = new A
val b = new B
val c = new D
