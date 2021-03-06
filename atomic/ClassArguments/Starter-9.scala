// Starter Code for Exercise 9
// From "Class Arguments" atom
import com.atomicscala.AtomicTest._

def squareThem(nums: Int*) = {
	var total = 0
	for (n <- nums)
		total += n * n
	total
}

squareThem(2) is 4
squareThem(2, 4) is 20
squareThem(1, 2, 4) is 21
