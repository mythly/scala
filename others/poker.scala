import scala.collection.mutable.Map
import scala.math.BigInt

class Solver(n: Int) {
	def f(state: Vector[Int]): BigInt = {
		val o = memory.get(state)
		if (!o.isEmpty)
			return o.get
		state match {
			case Vector(13, 0, 0, 0, 0, _) => 1
			case _ => {
				var sum = BigInt(0)				
				for (i <- 1 to 4) {
					val choices = (if (i == state.last) state(i) - 1 else state(i)) * i
					if (choices > 0) {
						val part1 = state.slice(0, i - 1)
						val part2 = Vector(state(i - 1) + 1, state(i) - 1)
						val part3 = state.slice(i + 1, state.length - 1)
						val part4 = Vector(i)
						val modifiedState = part1 ++ part2 ++ part3 ++ part4						
						sum += choices * f(modifiedState)
					}
				}
				memory += state -> sum
				sum
			}
		}
	}

	def count = f(Vector(0, 0, 0, 0, n, -1))
	def total = (1 to n * 4).map(BigInt(_)).reduce(_ * _)

	var memory = Map[Vector[Int], BigInt]()
}

val solver = new Solver(13)
println("Expected possibility = " + solver.count)
println("Total possibility = " + solver.total)
println("The propobility that no two adjacent cards share same number after a random shuffle = " + solver.count.toDouble / solver.total.toDouble)

/*
Expected possibility = 981060862423245150073141067185004129776283019053858862120566784
Total possibility = 80658175170943878571660636856403766975289505440883277824000000000000
The propobility that no two adjacent cards share same number after a random shuffle = 1.216319189398994E-5
*/
