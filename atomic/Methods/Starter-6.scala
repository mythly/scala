// Starter Code for Exercise 6
// From "Methods" atom

def manyTimesString(str: String, times: Int): String = { str * times }

val m1 = manyTimesString("abc", 3)
assert("abcabcabc" == m1, "Your message here")
val m2 = manyTimesString("123", 2)
assert("123123" == m2, "Your message here")

println(manyTimesString("abc", 1))
println(manyTimesString("abc", 0))
println(manyTimesString("abc", -1))