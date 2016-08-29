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