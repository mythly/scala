// Starter Code for Exercise 3
// From "Lists & Recursion" atom
import com.atomicscala.AtomicTest._

def sumIt(list: List[Int]): Int = list.reduce(_ + _)

sumIt(List(1, 2, 3)) is 6
sumIt(List(45, 45, 45, 60)) is 195
