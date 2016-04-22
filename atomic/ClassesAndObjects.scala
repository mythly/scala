val r1 = 1 to 10
println(r1.step)
val r2 = Range(1, 10, 2)
println(r2.step)

val s = "This is an experiment"
s.split(" ").foreach(println)

var s1 = "Sally"
var s2 = "Sally"
println(s1)
println(s2)
println(if (s1.equals(s2)) "equal" else "not equal")
s2 = "Sam"
println(s1)
println(s2)
println(if (s1.equals(s2)) "equal" else "not equal")

val s3 = s1.toUpperCase
println(if (s1.equals(s3)) "equal" else "not equal")
