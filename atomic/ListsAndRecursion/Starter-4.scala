// Starter Code for Exercise 4
// From "Lists & Recursion" atom
import com.atomicscala.AtomicTest._

def calcFreq(list: List[String], item: String): Int = {
	if (list.isEmpty)
		0
	else
		(if (list.head == item) 1 else 0) + calcFreq(list.tail, item)
}

val animalList = List("cat", "dog", "cat", "bird", "cat", "cat", "kitten", "mouse")

calcFreq(animalList, "cat") is 4
calcFreq(animalList, "dog") is 1
