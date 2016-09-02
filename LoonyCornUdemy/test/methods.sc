// defining a method
def max(x:Int, y:Int): Int = {
  if (x > y)
    x
  else
    y
}

max(3,5)

// another way of defining the same method, without curly braces
// allowed but not recommended for maintainability
def max1(x:Int, y:Int): Int =
  if (x > y)
    x
  else
    y

max1(5,3)

// an even more concise way of writing the same method
def max2(x:Int, y:Int): Int = if (x > y) x else y

max2(3,5)


