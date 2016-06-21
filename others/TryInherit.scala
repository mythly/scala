class A {
	def f: C = new C(1)
}

class B extends A {
	override def f: D = new D(2)
}

class C(x: Int) {
	def value = x + 1
}

class D(val x: Int) extends C(x) {
	def fvalue = 5
	override def value = super.value + 1
}

val a = new A
val b = new B
println(a.f.value)
println(b.f.value)
println(b.f.fvalue)
//println(a.f.fvalue)