import com.atomicscala.AtomicTest._

val vi = Vector(1, 2)
val vd = Vector(1.0, 2.5)
val vs = Vector("abc", "dce")
val vv = Vector(vi, vd, vs)

println(vi.toString + " " + vi.min + " " + vi.max + " " + vi.sum)
println(vd.toString + " " + vd.min + " " + vd.max + " " + vd.sum)
println(vs.toString + " " + vs.min + " " + vs.max);// + " " + vs.sum)

val r = Range(0, 10, 2)
println(r.sum)

val lw = List("cab", "abc")
val sw = Set("cab", "abc")
for (w <- lw)
	println(w)
for (w <- sw)
	println(w)
for (w <- lw.sorted)
	println(w)
/*
for (w <- sw.sorted)
	println(w)
*/
for (w <- lw.reverse)
	println(w)
/*
for (w <- sw.reverse)
	println(w)
*/

val v1 = Vector(1, 2, 3, 4, 5, 6)
val v2 = Vector(1, 2, 3, 4, 5, 6)
v1 is v2
