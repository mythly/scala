// Starter Code for Exercise 3
// From "Methods" atom

def isArg1GreaterThanArg2(x: Double, y: Double): Boolean = { x > y }

val t1 = isArg1GreaterThanArg2(4.1, 4.12)
assert(4.1 > 4.12 == t1)
val t2 = isArg1GreaterThanArg2(2.1, 1.2)
assert(2.1 > 1.2 == t2)
