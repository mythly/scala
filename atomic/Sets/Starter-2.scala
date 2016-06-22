// Starter Code for Exercise 2
// From "Sets" atom
import com.atomicscala.AtomicTest._

val meats = Set("beef", "chicken")
val vegetarian = Set("kidney beans", "black beans", "tofu")
val groceryCart2 = Set("apple", "pretzels",
  "bread", "orange", "beef",
  "beans", "asparagus", "sweet potatoes",
  "kidney beans", "black beans")

def percentMeat(set: Set[String]) = (set & meats).size * 100.0 / set.size
def percentVegetarian(set: Set[String]) = (set & vegetarian).size * 100.0 / set.size
def percentProtein(set: Set[String]) = (set & (meats | vegetarian)).size * 100.0 / set.size

percentMeat(groceryCart2) is 10.0
percentVegetarian(groceryCart2) is 20.0
percentProtein(groceryCart2) is 30.0
