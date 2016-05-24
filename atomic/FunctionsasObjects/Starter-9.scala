// Starter Code for Exercise 9
// From "Functions as Objects" atom
import com.atomicscala.AtomicTest._

var s = ""
val words = Vector("word", "cat", "animal")
val pluralize = (str: String) => str + "s"
words.foreach(s += pluralize(_) + " ")
s is "words cats animals "
