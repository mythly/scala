// Starter Code for Exercise 1
// From "Sets" atom
import com.atomicscala.AtomicTest._ 

val fruits = Set("apple", "orange", "banana", "kiwi")
val vegetables = Set("beans", "peas",
  "carrots", "sweet potatoes",
  "asparagus", "spinach")
val meats = Set("beef", "chicken")
val groceryCart = Set("apple",
  "pretzels", "bread", "orange", "beef",
  "beans", "asparagus", "sweet potatoes",
  "spinach", "carrots")

def percentMeat(set: Set[String]) = (set & meats).size * 100.0 / set.size
def percentFruit(set: Set[String]) = (set & fruits).size * 100.0 / set.size
def percentVeggies(set: Set[String]) = (set & vegetables).size * 100.0 / set.size
def percentOther(set: Set[String]) = (set -- (meats | fruits | vegetables)).size * 100.0 / set.size

percentMeat(groceryCart) is 10.0
percentFruit(groceryCart) is 20.0
percentVeggies(groceryCart) is 50.0
percentOther(groceryCart) is 20.0
