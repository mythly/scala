// Starter Code for Exercise 5
// From "Methods" atom

def addStrings(str1: String, str2: String): String = { str1 + str2 }

val s1 = addStrings("abc", "def")
assert(s1 == "abcdef")
val s2 = addStrings("zyx", "abc")
assert(s2 == "zyxabc")
