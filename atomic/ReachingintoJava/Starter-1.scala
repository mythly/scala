// Starter Code for Exercise 1
// From "Reaching into Java" atom
import com.atomicscala.AtomicTest._

import java.text.SimpleDateFormat
val datePattern = new SimpleDateFormat("MM/dd/yy")

val mayDay = datePattern.parse("05/01/12")
mayDay.getDate is 1
mayDay.getMonth is 4
