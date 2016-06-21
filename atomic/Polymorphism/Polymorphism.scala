import com.atomicscala.AtomicTest._

trait Mobile {
	val moving: String
}

class Animal extends Mobile {
	val moving = "Animal"
}

class Car extends Mobile {
	val moving = "Car"
}

def move(mobile: Mobile) = s"${mobile.moving} is moving"

move(new Animal) is "Animal is moving"
move(new Car) is "Car is moving"
