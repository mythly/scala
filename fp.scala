def fib(in: Any): Int = {
	//println("Calc on " + in)
	in match {
		case 0 => 0
		case 1 => 1
		case n : Int if (n > 0) => fib(n - 1) + fib(n - 2)
		case n : String => fib(n.toInt)
		case _ => 0
	}
}

//(-2 to 3).foreach(x => println(x + " : " + fib(x)))
println(fib("12"))

/* --------------------------------------------------------- */

abstract class Expr

case class FibExpr(n: Int) extends Expr

case class SumExpr(a : Expr, b : Expr) extends Expr

def value(in: Expr): Int = in match {
	case FibExpr(0) => 0
	case FibExpr(1) => 1
	case FibExpr(n) if (n > 0) => value(SumExpr(FibExpr(n - 1), FibExpr(n - 2)))
	case SumExpr(a, b) => value(a) + value(b)
	case _ => 0
}

println(value(FibExpr(3)))

/* --------------------------------------------------------- */

val list = List(1, 2, 3, 4, 5, 6, 7)

def containsOdd(list: List[Int]): Boolean = list match {
	case Nil => false
	case x :: xs => if (x % 2 == 1) true else containsOdd(xs)
}

println(containsOdd(list))
println(list.exists(_ % 2 == 1))
println(list.filter(_ % 2 == 1).filter(_ % 3 == 1).size)

/* --------------------------------------------------------- */

val file = List("warn 2013 msg", "warn 2012 msg", "error 2013 msg", "warn 2013 msg")

def wordCount(str: String): Int = str.split(" ").count(_ == "msg")

def foldLeft(list: List[Int])(init: Int)(f: (Int, Int) => Int): Int = {
	list match {
		case Nil => init
		case x :: xs => foldLeft(xs)(f(init, x))(f)
	}
}

println("word count : " + file.map(wordCount).reduceLeft(_ + _))
println("word count : " + foldLeft(file.map(wordCount))(0)(_ + _))

