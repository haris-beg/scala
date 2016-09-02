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
