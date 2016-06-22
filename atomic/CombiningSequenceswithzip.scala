// Starter Code for Exercise 1
// From "Combining Sequences with zip" atom
import com.atomicscala.AtomicTest._

val people = List("Sally Smith",
  "Dan Jones", "Tom Brown", "Betsy Blanc",
  "Stormy Morgan", "Hal Goodsen")

val l = people.length
val group1 = people.take(l / 2)
val group2 = people.takeRight(l - l / 2)
val pairs = group1.zip(group2)

pairs is Vector(
  ("Sally Smith","Betsy Blanc"),
  ("Dan Jones","Stormy Morgan"),
  ("Tom Brown","Hal Goodsen"))

val people2 = people :+ "New Guy"
val l2 = people2.length
val group3 = people2.take(l / 2)
val group4 = people2.takeRight(l - l / 2)
val pairs2 = group3.zip(group4)
println(people2)

def number(s:String) = s.zip(Range(0, s.length)).map {
	case (c, idx) => (idx, c)
}
number("Howdy") is
Vector((0,'H'), (1,'o'), (2,'w'),
       (3,'d'), (4,'y'))
