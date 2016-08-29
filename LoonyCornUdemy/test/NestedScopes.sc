val radius = 10
val area =
{
  val PI = 3.1
  println(s"Inside scope 1, PI = $PI");
  //PI * radius * radius;
  {
    val PI = 3.14
    println(s"Inside scope 2, PI = $PI")
    PI * radius * radius
  }
  PI * radius * radius
}