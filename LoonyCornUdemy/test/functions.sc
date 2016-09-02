// a function literal (a nameless function)
// this is a first class object in Scala
(x:Int) => x + 1

// a named function
// how is this different from methods?
def getRectangleArea(length:Double, breadth:Double):Double =
{
  println(s"l = $length, b = $breadth");
  length * breadth
}

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
def getCircleStats(r:Double, PI:Double = 3.14) = {
  //val PI = 3.14
  def getCircleArea(r:Double) = PI * r * r
  def getCircleCircumference(r:Double) = 2 * PI * r
  (getCircleArea(r),getCircleCircumference(r))
}

def getCircleStats2(PI:Double = 3.14, r:Double) = {
  //val PI = 3.14
  def getCircleArea(r:Double) = PI * r * r
  def getCircleCircumference(r:Double) = 2 * PI * r
  (getCircleArea(r),getCircleCircumference(r))
}

// Parameter default values
getCircleStats(10)
getCircleStats(10, 3.14159)
//getCircleStats2(10)
getCircleStats2(r = 10)



// Named function parameters
// Invoking function with parameters in any order
getRectangleArea(breadth = 5, length = 10)


// Type Parameters: Parametric Polymorphism
val someList = 2 :: 1 :: "bar" :: "foo" :: Nil
//val someList:List[String] = 2 :: 1 :: "bar" :: "foo" :: Nil

def printPairTypes[K,V](k:K, v:V) = {
  val keyType = k.getClass
  val valueType = v.getClass
  println(s"$k, $v are values of types $keyType, $valueType")
}

printPairTypes(12, "12")
