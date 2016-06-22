// Starter Code for Exercise 1
// From "Lists & Recursion" atom
import com.atomicscala.AtomicTest._

def max(list: List[Int]): Int = {
	if (list.tail.isEmpty)
		list.head
	else
		math.max(list.head, max(list.tail))
}

val aList = List(10, 20, 45, 15, 30)
max(aList) is 45
