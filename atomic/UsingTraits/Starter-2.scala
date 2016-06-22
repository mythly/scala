// Starter Code for Exercise 2
// From "Using Traits" atom
import com.atomicscala.AtomicTest._

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

val c = new Object with Connections
c.maxConnections is 5
c.connect(true) is true
c.connected is 1
for(i <- 0 to 3)
  c.connect(true) is true
c.connect(true) is false
c.connect(false) is true
c.connected is 4
for(i <- 0 to 3)
  c.connect(false) is true
c.connected is 0
c.connect(false) is false
