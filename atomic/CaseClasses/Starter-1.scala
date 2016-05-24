// Starter Code for Exercise 1
// From "Case Classes" atom
import com.atomicscala.AtomicTest._

case class Person(first: String, last: String, email: String)

val p = Person("Jane", "Smile", "jane@smile.com")
p.first is "Jane"
p.last is "Smile"
p.email is "jane@smile.com"
