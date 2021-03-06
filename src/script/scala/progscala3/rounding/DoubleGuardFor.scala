// src/script/scala/progscala3/rounding/DoubleGuardFor.scala

import progscala3.rounding.WeekDay

for {
  day <- WeekDay.values
  if WeekDay.isWorkingDay(day)
} println(day)

for { 
  day <- WeekDay.values
  str  = day.toString                           // <1>
  if str.startsWith("T") || str.endsWith("t")
} println(day)
