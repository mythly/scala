// Starter Code for Exercise 1
// From "Brevity" atom
import com.atomicscala.AtomicTest._

def assignResult(arg:Boolean):Int = {
  if(arg) 42 else 47
}

assignResult(true) is 42
assignResult(false) is 47
