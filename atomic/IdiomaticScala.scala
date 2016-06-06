import com.atomicscala.AtomicTest._

{
	// If4.scala

	val z = false
	println(if (z) "It's true!" else "It's false")
	/* Output:
	It's false
	*/
}

// If5.scala

{
	val result = if (99 > 100) 4 else 42
	println(result)

	/* Output:
	42
	*/
}

// For.scala

{
	var result = (0 to 9).map(_ + " ").reduce(_ + _)
	result is "0 1 2 3 4 5 6 7 8 9 "

	result = (0 until 10).map(_ + " ").reduce(_ + _)
	result is "0 1 2 3 4 5 6 7 8 9 "

	result = Range(0, 10).map(_ + " ").reduce(_ + _)
	result is "0 1 2 3 4 5 6 7 8 9 "

	result = Range(0, 20, 2).map(_ + " ").reduce(_ + _)
	result is "0 2 4 6 8 10 12 14 16 18 "

	var sum = 0
	for(i <- Range(0, 20, 2)) {
		println("adding " + i + " to " + sum)
		sum += i
	}
	sum is 90	
}

// CompoundExpressions2.scala

{
	val activity = "swimming"
	val hour = 10
	val isOpen = 
		if (activity == "swimming" || activity == "ice skating") {
			val opens = 9
			val closes = 20
			println("Operating hours: " + opens + " - " + closes)
			hour >= opens && hour <= closes
		}else
			false

	println(isOpen)
	/* Output:
	Operating hours: 9 - 20
	true
	*/
}

// AddMultiply.scala

{
	def addMultiply(x:Int, y:Double, s:String) = {
		println(s)
		(x + y) * 2.1
	}

	val r2 = addMultiply(7, 9, "Inside addMultiply")
	println(r2)

	def test(x:Int, y:Double, s:String, expected:Double) = {
	  val result = addMultiply(x, y, s)
	  assert(result == expected, "Expected " + expected + " Got " + result)
	  println("result: " + result)
	}

	test(7, 9, "Inside addMultiply", 33.6)

	/* Output:
	Inside addMultiply
	33.6
	Inside addMultiply
	result: 33.6
	*/
}

// CheckTruth.scala
{
	def checkTruth(exp1:Boolean, exp2:Boolean) = 
		(exp1, exp2) match {
			case (true, true) => "Both are true"
			case (true, false) => "First: true, second: false"
			case (false, true) => "First: false, second: true"
			case (false, false) => "Both are false"
		}

	checkTruth(true || false, true) is
	  "Both are true"
	checkTruth(1 > 0 && -1 < 0, 1 == 2) is
	  "First: true, second: false"
	checkTruth(1 >= 2, 1 >= 1) is
	  "First: false, second: true"
	checkTruth(true && false,false && true) is
	"Both are false"
}

// Cat.scala
{
	class Cat {
	  def meow = "mew!"
	}

	val cat = new Cat
	val m1 = cat.meow
	assert("mew!" == m1, "Expected mew!, Got " + m1)
}

// Hamster.scala
{
	class Hamster {
	  def speak = "squeak!"
	  def exercise = speak + " Running on wheel"	  
	}

	val hamster = new Hamster
	val e1 = hamster.exercise
	assert("squeak! Running on wheel" == e1, "Expected squeak! Running on wheel" + ", Got " + e1)
}

// ClassArg.scala
{
	class ClassArg(a:Int) {
	  println(f)
	  def f = a * 10 
	}

	val ca = new ClassArg(19)
	ca.f is 190
	// ca.a // error
}

// VariableClassArgs.scala
{
	class Sum(args:Int*) {
	  def result = args.reduce(_ + _)
	}

	new Sum(13, 27, 44).result is 84
	new Sum(1, 3, 5, 7, 9, 11).result is 36
}