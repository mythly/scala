import com.atomicscala.AtomicTest._

// practice 1
{
	abstract class Base {
	  def f1:Int
	  def f2:Int
	  val d1:Int
	  val d2:Int
	  var d3:Int
	  var n = 1
	}

	class Derived extends Base {
	  def f1 = 1
	  val f2 = 1 // Was def, now val
	  val d1 = 1
	  // Can't do this; must be a val:
	  // def d2 = 1
	  val d2 = 1
	  def d3 = n
	  def d3_= (newVal: Int) = n = newVal
	}

	val d = new Derived
	d.d3 is 1 // Calls getter (line 20)
	d.d3 = 42 // Calls setter (line 21)
	d.d3 is 42
}

// practice 2
{
	class Base(var d3: Int) {
	  def f1:Int = 2
	  def f2:Int = 2
	  val d1:Int = 2
	  val d2:Int = 2
	  //var d3:Int = 2
	  var n = 1
	}

	class Derived(d3: Int) extends Base(d3) {
	  override def f1 = 1
	  override val f2 = 1 // Was def, now val
	  override val d1 = 1
	  // Can't do this; must be a val:
	  // def d2 = 1
	  override val d2 = 1
	  //def d3 = n
	  //def d3_= (newVal: Int) = n = newVal
	}

	val d = new Derived(1)
	d.d3 is 1 // Calls getter (line 20)
	d.d3 = 42 // Calls setter (line 21)
	d.d3 is 42
}

// practice 3
class A {
	var internal = 1	
	def x = internal
	def x_= (newValue: Int) = internal = newValue 
}

val a = new A
a.internal is 1
a.internal = 2
a.internal is 2
a.x is 2
a.x = 3
a.x is 3

