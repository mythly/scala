class A {
	def f(x: Int) = println("Int " + x)
	def f(x: String) = println("String " + x)
	def g(x: Int, xs: Int*) = println(1 + xs.length)
	def g(xs: String*) = println(xs.length)
}

val a = new A
a.f(1)
a.f("1")

implicit def conv(x: Int): String = x.toString

a.f(1)
a.f("1")

a.g(1, 2)
a.g("1", "2", "3")
a.g()