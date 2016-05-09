// Starter Code for Exercise 2
// From "More Conditionals" atom
import com.atomicscala.AtomicTest._

def isPalindrome(s: String) = { s == s.reverse }

isPalindrome("mom") is true
isPalindrome("dad") is true
isPalindrome("street") is false
