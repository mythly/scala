// Starter Code for Exercise 3
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

trait Connections {
	val maxConnections = 5
	var connected = 0
	def connect(flag: Boolean) = {
		flag match {
			case true if connected < maxConnections => {
				connected += 1
				true
			}
			case false if connected > 0 => {
				connected -= 1
				true
			}
			case _ => false
		}		
	}
}

val c2 = new WIFICamera with Connections
c2.maxConnections is 5
c2.connect(true) is true
c2.connected is 1
c2.connect(false) is true
c2.connected is 0
c2.connect(false) is false
