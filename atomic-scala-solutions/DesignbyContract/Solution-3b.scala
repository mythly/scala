// Solution-3b.scala
// Solution to Exercise 3 in "Design by Contract"
// Run with
// > scala -Xelide-below 2001 Solution-3b.scala
import com.atomicscala.AtomicTest._

def f(n:Int) = {
  val result = n * 3
  assume(result % 2 == 0, "result should be even: " + result)
  result
}

def test(nums:Int*) =
  for(n <- nums)
    try {
      f(n) is n*3
    } catch {
      case e:Throwable => println(e.getMessage)
    }

test(2, 8, 20, 11, 22, 23)

/* OUTPUT_SHOULD_BE
6
24
60
33
66
69
*/
