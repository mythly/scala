// Brevity3.scala
import com.atomicscala.AtomicTest._

def filterWithYield3(
  v:Vector[Int]):Vector[Int] =
  for {
    n <- v
    if n < 10
    if n % 2 != 0
  } yield n

val v = Vector(1,2,3,5,6,7,8,10,13,14,17)
filterWithYield3(v) is Vector(1,3,5,7)
