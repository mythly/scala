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
						val part4 = Vector(i - 1)
						val modifiedState = part1 ++ part2 ++ part3 ++ part4
						sum += choices * f(modifiedState)
					}
				}
				memory += state -> sum
				sum
			}
		}
	}

	def count = f(Vector(0, 0, 0, 0, n, 0))
	def total = (1 to n * 4).map(BigInt(_)).reduce(_ * _)

	var memory = Map[Vector[Int], BigInt]()
}

val solver = new Solver(13)
println("Expected possibility = " + solver.count)
println("Total possibility = " + solver.total)
println("The propobility that no two adjacent cards share same number after a random shuffle = " + solver.count.toDouble / solver.total.toDouble)
println("The propobility that at least two adjacent cards share same number after a random shuffle = " + (1 - solver.count.toDouble / solver.total.toDouble))

/*
Expected possibility = 3668033946384704437729512814619767610579526911188666362431432294400
Total possibility = 80658175170943878571660636856403766975289505440883277824000000000000
The propobility that no two adjacent cards share same number after a random shuffle = 0.045476282331094305
The propobility that at least two adjacent cards share same number after a random shuffle = 0.9545237176689056
*/
