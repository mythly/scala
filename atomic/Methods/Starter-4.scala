// Starter Code for Exercise 4
// From "Methods" atom

def getMe(str: String): String = { str.toLowerCase }

val g1 = getMe("abraCaDabra")
assert("abracadabra" == g1, "Your message here")
val g2 = getMe("zyxwVUT")
assert("zyxwvut"== g2, "Your message here")
