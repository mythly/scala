val sunny = true
val cloudy = false
val temp : Double = 81
if (sunny && temp > 80)
	println(true)
if ((sunny || cloudy) && temp > 80)
	println(true)
if ((sunny || cloudy) && (temp > 80 || temp < 20))
	println(true)

val c = (temp - 32) * 5 / 9
println(c)
val t = c * 9 / 5 + 32
println(t)
