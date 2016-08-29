val dayOfWeek = "Saturday"
val typeOfDay = dayOfWeek match {
  case "Monday" => "Manic Monday"
    //OR-ed expression shown below
  case "Tuesday"|"Wednesday"|"Thursday"|"Friday" => "Other Working Day"
    //Pattern guard shown below
  case someOtherDay if someOtherDay == "Saturday" => "Sizzling Saturday"
  case someOtherDay if someOtherDay == "Sunday" => "Sleepy Sunday"
}

// Value Binding Patterns
val typeOfDay1 = dayOfWeek match {
  case "Monday" => "Manic Monday"
  case "Sunday" => "Sleepy Sunday"
  case someOtherDay => {
    println(s"Some other day - neither Sunday nor Monday, it's $someOtherDay")
    someOtherDay
  }
}

// Wildcard Operator patterns
val typeOfDay2 = dayOfWeek match {
  case "Monday" => "Manic Monday"
  case "Sunday" => "Sleepy Sunday"
  case _ => {
    val errorString = s"Some other day - neither Sunday nor Monday, it's $dayOfWeek"
    errorString
  }
}

// Down Casting with Pattern Variables, ie
// Matching on the data type
var radius:Any = 10
val typeOfRadius = radius match {
  case radius:Int => "Integer"
  case radius:String => "String"
  case radius:Double => "Double"
  case _ => "Any"
}

// String derives from AnyRef
radius = 10.0
val typeOfRadius1 = radius match {
  case radius: Int => "Integer"
  case radius: AnyRef => "String"
  case _ => "Any"
}

val typeOfRadius2 = radius match {
  case radius:Int => "Integer"
  case radius:String => "String"
  case _ => "Any"
}

// scrutinee must be a base type
// this is a quirk of match expression
//val radius3 = "10"
//val typeOfRadius3 = radius3 match {
//  case radius3:Int => "Integer"
//  case radius3:String => "String"
//  case radius3: Double => "Double"
//  case _ => "Any"
//}