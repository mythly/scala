// Starter Code for Exercise 4
// From "Reaching into Java" atom
import com.atomicscala.AtomicTest._

import org.apache.commons.math3.stat.Frequency

val f = new Frequency
List("cat", "dot", "cat", "bird", "cat", "cat", "kitten", "mouse").foreach(f.addValue)
f.getCount("cat") is 4
