// Starter Code for Exercise 1
// From "Using Traits" atom
import com.atomicscala.AtomicTest._

trait WIFI {
	def reportStatus = "working"
	def address: String
}

class Camera {
	def showImage = "Showing video"
}

class WIFICamera extends Camera with WIFI {	
	val address = "192.168.0.200"	
}

val webcam = new WIFICamera
webcam.showImage is "Showing video"
webcam.address is "192.168.0.200"
webcam.reportStatus is "working"
