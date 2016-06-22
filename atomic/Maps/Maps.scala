// Maps.scala
import com.atomicscala.AtomicTest._

val constants = Map(3.141 -> "Pi", 2.718 -> "e", 1.618 -> "phi")

Map((3.141, "Pi"), (2.718, "e"), (1.618, "phi")) is constants

Vector((3.141, "Pi"), (2.718, "e"), (1.618, "phi")).toMap is constants

// Look up a value from a key:
constants(2.718) is "e"

constants.keys is "Set(3.141, 2.718, 1.618)"

constants.values is
"MapLike(Pi, e, phi)"

// Iterate through key-value pairs:
(for(pair <- constants)
  yield pair.toString) is
"List((3.141,Pi), (2.718,e), (1.618,phi))"

// Unpack during iteration:
(for((k,v) <- constants)
  yield k + ": " + v) is
"List(3.141: Pi, 2.718: e, 1.618: phi)"

val langs = Map("English" -> "e", "French" -> "f", "Spanish" -> "s", "German" -> "g", "Chinese" -> "c")
langs is "Map(Chinese -> c, English -> e, Spanish -> s, German -> g, French -> f)"
val langs2 = langs + ("Turkish" -> "t")
langs2 is "Map(Chinese -> c, English -> e, Spanish -> s, German -> g, Turkish -> t, French -> f)"
val langs3 = langs2 + ("Chinese" -> "cc")
langs3 is "Map(Chinese -> cc, English -> e, Spanish -> s, German -> g, Turkish -> t, French -> f)"
langs3.contains("Spanish") is true
val langs4 = langs3 - "Spanish"
langs4 is "Map(Chinese -> cc, English -> e, German -> g, Turkish -> t, French -> f)"
langs4.contains("Spanish") is false

case class Name(firstName: String, lastName: String)
val m = Map("sally@taylor.com" -> Name("Sally","Taylor"))
val m2 = m + ("jiminy@cricket.com" -> Name("Jiminy", "Cricket"))
m2("jiminy@cricket.com") is Name("Jiminy", "Cricket")
m2("sally@taylor.com") is Name("Sally", "Taylor")
m2.contains("jiminy@cricket.com") is true
val m3 = m2 - "jiminy@cricket.com"
m3.contains("jiminy@cricket.com") is false

case class Person(name: String)
val personA = Person("A")
val personB = Person("B")
val p = Map(personA -> "a", personB -> "b")
p(personA) is "a"
p(personB) is "b"

class Person2(val name: String) {
	override def equals(t: Any) = name == t.asInstanceOf[Person2].name
}
val personC = new Person2("C")
val personD = new Person2("D")
val p2 = Map(personC -> "c", personD -> "d")
p2(personC) is "c"
p2(personD) is "d"
p2(new Person2("C")) is "c"