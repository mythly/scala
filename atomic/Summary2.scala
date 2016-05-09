import com.atomicscala.AtomicTest._

val vc = Vector('a', 'b')
val vi = Vector(1, 2)	
val vd = Vector(1.0, 2.5)
val vs = Vector("abc", "dce")

println(vc.toString + " " + vc.min + " " + vc.max + " " + vc.sum)
println(vi.toString + " " + vi.min + " " + vi.max + " " + vi.sum)
println(vd.toString + " " + vd.min + " " + vd.max + " " + vd.sum)
println(vs.toString + " " + vs.min + " " + vs.max);// + " " + vs.sum)

val vv = Vector(vc, vi, vd, vs)
var str = "";
for (v <- vv)
	for (item <- v)
		str += item.toString
println(str)

val vx = Vector(1, 1.5, 'a', "asd")		
//println(vx.max)

class Basic {
	def cube(x:Int):Int = { x * x * x }	
	def bang(s:String):String = { s + "!" }	
}

val b = new Basic
b.cube(3) is 27
b.bang("pop") is "pop!"

class NoBody {
	val who = "Nobody's home"
}

class SomeBody {
  val name = "Janet Doe"
  //println(name + " is SomeBody")
}

class EveryBody {
  val all = Vector(new SomeBody,
    new SomeBody, new SomeBody)
}

val nb = new NoBody
nb.who is "Nobody's home"

val sb = new SomeBody
sb.name is "Janet Doe"

val eb = new EveryBody
var everyone = ""
for(i <- eb.all) {
  everyone += i.name + ", "
}

everyone is "Janet Doe, Janet Doe, Janet Doe, "

class Temperature {
  var current = 0.0
  var scale = "f"
  def setFahrenheit(now:Double):Unit = {
    current = now
    scale = "f"
  }
  def setCelsius(now:Double):Unit = {
    current = now
    scale = "c"
  }
  def setAbsolute(now:Double):Unit = {
  	setCelsius(now - 273.15)
  }
  def getFahrenheit():Double = {
    if(scale == "f")
      current
    else
      current * 9.0/5.0 + 32.0
  }
  def getCelsius():Double = {
    if(scale == "c")
      current
    else
      (current - 32.0) * 5.0/9.0
  }
  def getAbsolute():Double = {
  	getCelsius + 273.15
  }
}

val temp = new Temperature
temp.setFahrenheit(98.6)
temp.getFahrenheit() is 98.6
temp.getCelsius is 37.0
temp.setCelsius(100.0)
temp.getFahrenheit is 212.0
temp.getAbsolute is 100 + 273.15
temp.setAbsolute(0)
temp.getCelsius is -273.15


class Cell {
  var entry = ' '
  def set(e:Char):String = {
    if(entry==' ' && (e=='X' || e=='O')) {
      entry = e
      "successful move"
    } else
      "invalid move"
  }
}

class Grid {
  val cells = Vector(
    Vector(new Cell, new Cell, new Cell),
    Vector(new Cell, new Cell, new Cell),
    Vector(new Cell, new Cell, new Cell)
  )
  def inside(x: Int, y: Int) = {
    Range(0, cells.size).contains(x) && Range(0, cells(x).size).contains(y)
  }
  def play(e:Char, x:Int, y:Int):String = {
    if(!inside(x, y))
      "invalid move"
    else {
      val ret = cells(x)(y).set(e)
      showGrid
      ret
    }
  }
  def showGrid() = {
  	var str = "";
	for (vc <- cells) {        
	  for (c <- vc) {
	    str += c.entry
	  }
	  str += '\n'
	}
	println(str)
  }  
  def check(i1: Int, j1: Int, i2: Int, j2: Int, i3: Int, j3: Int) = {  		
    if (inside(i1, j1) && inside(i2, j2) && inside(i3, j3)) {
      val c1 = cells(i1)(j1).entry
      val c2 = cells(i2)(j2).entry
      val c3 = cells(i3)(j3).entry
      c1 == c2 && c1 == c3
    }
    else
      false
  }
  def checkWinner(): Boolean = {
    for (i <- 0 until cells.size)
      for (j <- 0 until cells(i).size) {
        if (check(i, j, i, j + 1, i, j + 2))
          return true
        if (check(i, j, i + 1, j, i + 2, j))
          return true
        if (check(i, j, i + 1, j + 1, i + 2, j + 2))
          return true
        if (check(i, j, i + 1, j - 1, i + 2, j - 2))
          return true
      }
    false
  }
}

val grid = new Grid
grid.play('X', 0, 0)
grid.play('X', 0, 1)
grid.play('X', 0, 2)
grid.checkWinner() is true

val grid2 = new Grid
grid2.play('X', 0, 1)
grid2.play('X', 1, 1)
grid2.play('X', 2, 1)
grid2.checkWinner() is true

val grid3 = new Grid
grid3.play('X', 0, 0)
grid3.play('X', 1, 1)
grid3.play('X', 2, 2)
grid3.checkWinner() is true

val grid4 = new Grid
grid4.play('X', 0, 2)
grid4.play('X', 1, 1)
grid4.play('X', 2, 0)
grid4.checkWinner() is true

// need to be all same symbol
val grid5 = new Grid
grid5.play('X', 0, 2)
grid5.play('O', 1, 1)
grid5.play('X', 2, 0)
grid5.checkWinner() is false

// needs to work for O too!
val grid6 = new Grid
grid6.play('O', 0, 0)
grid6.play('O', 0, 1)
grid6.play('O', 0, 2)
grid6.checkWinner() is true
