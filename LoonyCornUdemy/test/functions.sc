// a function literal (a nameless function)
// this is a first class object in Scala
(x:Int) => x + 1

// a named function
// how is this different from methods?
def getRectangleArea(length:Double, breadth:Double):Double =
{length * breadth}

val area = getRectangleArea(4,6)


// functions with no input parameters
def sayHello():String = "Hello"
def sayHello2:String = "Hello2"
sayHello()
sayHello
sayHello2
//sayHello2()


val perimeterOfSquare = 20.0

// Invoking a function with an expression block
// Packing function parameters
(getRectangleArea _).tupled(
  {
    val sideOfSquare = perimeterOfSquare/4;
    (sideOfSquare, sideOfSquare)
  }

)


// Nested functions
def getCircleStats(r:Double) = {
  val PI = 3.14
  def getCircleArea(r:Double) = PI * r * r
  def getCircleCircumference(r:Double) = 2 * PI * r
  (getCircleArea(r),getCircleCircumference(r))
}


