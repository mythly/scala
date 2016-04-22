val activity = "ice skating"
val hour = 10
var temperature = 30

val isOpen = {	
	if (activity == "swimming" || activity == "ice skating") {
		val opens = 9
		val closes = 20
		println("Operating hours: " +
			opens + " - " + closes)
		hour >= opens && hour <= closes    
	} else {
		false
	}
}

val isGoodTemperature = {
	if (activity == "swimming")
		temperature > 20 && temperature < 40
	else
		if (activity == "ice skating")
			temperature < 10
		else
			true
}

val shouldDoActivity = isOpen && isGoodTemperature
println(activity + ":" + isOpen + " && " + isGoodTemperature + " = " + shouldDoActivity)

val distance = 9
val willDo = {
	if (activity == "ice skating")
		distance < 10
	else
		distance > 10
}
println(activity + ":" + willDo)