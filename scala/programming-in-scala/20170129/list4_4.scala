import ChecksumAccumulator.calculate

object FailWinterSpringSummer extends App {
  for (season <- List("fall", "winter", "spring"))
    println(season +": "+ calculate(season))
}
