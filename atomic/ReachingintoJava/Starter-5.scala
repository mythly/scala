// Starter Code for Exercise 5
// From "Reaching into Java" atom
import com.atomicscala.AtomicTest._

import org.apache.commons.math3.stat.descriptive.SummaryStatistics

val s = new SummaryStatistics
List[Double](10, 20, 30, 80, 90, 100).foreach(s.addValue)

s.getMean is 55
s.getStandardDeviation is 39.370039370059054
