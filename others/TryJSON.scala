import scala.util.parsing.json._

val header = List("a", "b", "c")
val headerType = List("string", "integer", "string")
val row1 = List("hello", 1, "wolrd")
val row2 = List("good", 2, "morning")
val row3 = List("how", 3, "are you")

val data = new JSONArray(List(new JSONArray(row1), new JSONArray(row2), new JSONArray(row3)))
val obj = new JSONObject(Map("header" -> header, "header_type" -> headerType, "rows" -> 3, "data" -> data))
println(obj.toString())
