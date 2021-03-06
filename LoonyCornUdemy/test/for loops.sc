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

// first type of  for loop iterator (value binding)
for (day <- daysOfWeekList) {
  println(day)
}

// second type of for loop iterator (numeric range)
for (i <- 0 to daysOfWeekList.size - 1) {
  println(daysOfWeekList(i))
}

// numeric range iteration with "until"
for (i <- 0 until daysOfWeekList.size) {
  println(daysOfWeekList(i))
}

// for loop combined with if condition (Pattern Guard)
for (day <- daysOfWeekList if day == "Mon") {
  println("Manic Monday")
}

// Nested for loops
for {i <- 0 until 7
    j <- 0 to 10} {
  println(s"$i, $j")
}
