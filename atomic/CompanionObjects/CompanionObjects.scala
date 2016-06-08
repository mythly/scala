class WalkActivity

object WalkActivity {
	def start(name: String) = {
		log += s"[$name] Activity started"
		println(s"$name started!")
	}
	def stop(name: String) = {
		log += s"[$name] Activity stopped"
		println(s"$name stopped!")
	}
	var log: String = ""
}

WalkActivity.start("bar")
WalkActivity.stop("bar")
println(WalkActivity.log)
