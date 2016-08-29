val daysOfWeekList = List("Mon","Tue","Wed","Thu","Fri","Sat","Sun")

// for loop statement
for (day <- daysOfWeekList) {
  day match {
    case "Mon" => println("Manic Monday")
    case otherDay => println(otherDay)
  }
}

// for loop expression
val x = for (day <- daysOfWeekList) yield {
  day match {
    case "Mon" => "Manic Monday"
    case otherDay => otherDay
  }
}