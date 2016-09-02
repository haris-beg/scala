def printHello : Unit = println("Hello!")

printHello

// omitting return type with type inference
// but this is BAD PRACTICE for procedures
def printHello1 = println("Hello1 !")

printHello1

// another way of writing the procedure, with curly braces
def printHello2 { println("Hello2 !")}

printHello2