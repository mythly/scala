import com.atomicscala.AtomicTest._

class ClothesWasher(val model: String, val capacity: Double) {
	def this(model: String) = this(model, 10.0)
	def this(capacity: Double) = this("a", capacity)	
}

val c1 = new ClothesWasher("b")
c1.model is "b"
c1.capacity is 10.0

val c2 = new ClothesWasher(20.0)
c2.model is "a"
c2.capacity is 20.0

class ClothesWasher2(val model: String = "a", val capacity: Double = 10.0)	

val c3 = new ClothesWasher2(model = "b")
c3.model is "b"
c3.capacity is 10.0

val c4 = new ClothesWasher2(capacity = 20.0)
c4.model is "a"
c4.capacity is 20.0
