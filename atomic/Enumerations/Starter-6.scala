// Starter Code for Exercise 6
// From "Enumerations" atom
import com.atomicscala.AtomicTest._

object Level extends Enumeration {
  type Level = Value
  val Overflow, High, Medium, Low, Empty, Draining, Pooling, Dry = Value
}

Level.Medium is "Medium"
import Level._
Medium is "Medium"

{ for(n <- Range(0, Level.maxId))
    yield (n, Level(n)) } is
  Vector((0, Overflow), (1, High),
    (2, Medium), (3, Low), (4, Empty), (5, Draining), (6, Pooling), (7, Dry))

{ for(lev <- Level.values)
    yield lev }.toIndexedSeq is
  Vector(Overflow, High, Medium, Low, Empty, Draining, Pooling, Dry)

def checkLevel(level:Level)= level match {
  case Overflow | Pooling => "Warning!"
  case Empty | Dry => "Alert"
  case other =>  s"Level $level OK"
}

Level.Draining is Draining
Level.Draining.id is 5
checkLevel(Low) is "Level Low OK"
checkLevel(Empty) is "Alert"
checkLevel(Draining) is "Level Draining OK"
checkLevel(Pooling) is "Warning!"
checkLevel(Dry) is "Alert"
