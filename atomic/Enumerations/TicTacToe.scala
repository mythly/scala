import com.atomicscala.AtomicTest._

object CellType extends Enumeration {
  type CellType = Value
  val Empty, X, O = Value
}

import CellType._

class Cell {
  var entry = Empty
  def set(e: CellType): String = {
    if (entry == Empty && (e == X || e == O)) {
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
  def play(e:CellType, x:Int, y:Int):String = {
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
	    str += {if (c.entry == Empty) " " else c.entry}
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
grid.play(X, 0, 0)
grid.play(X, 0, 1)
grid.play(X, 0, 2)
grid.checkWinner() is true

val grid2 = new Grid
grid2.play(X, 0, 1)
grid2.play(X, 1, 1)
grid2.play(X, 2, 1)
grid2.checkWinner() is true

val grid3 = new Grid
grid3.play(X, 0, 0)
grid3.play(X, 1, 1)
grid3.play(X, 2, 2)
grid3.checkWinner() is true

val grid4 = new Grid
grid4.play(X, 0, 2)
grid4.play(X, 1, 1)
grid4.play(X, 2, 0)
grid4.checkWinner() is true

// need to be all same symbol
val grid5 = new Grid
grid5.play(X, 0, 2)
grid5.play(O, 1, 1)
grid5.play(X, 2, 0)
grid5.checkWinner() is false

// needs to work for O too!
val grid6 = new Grid
grid6.play(O, 0, 0)
grid6.play(O, 0, 1)
grid6.play(O, 0, 2)
grid6.checkWinner() is true
