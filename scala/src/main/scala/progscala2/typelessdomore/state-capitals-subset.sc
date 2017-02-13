
val stateCapitals = Map(
  "Alabama" -> "Montgomery",
  "Alaska" -> "Juneau",
  "Wyoming" -> "Cheyenne")

println( "Get the capiatls wrapped in Options:" )
println( "Alabama: " + stateCapitals.get("Alabama") )
println( "Wyoming: " + stateCapitals.get("Wyoming") )
println( "Unkwon: " + stateCapitals.get("Unknown") )
println( "Get the capitals themselves out of the  Options:" )
println( "Alabama: " + stateCapitals.get("Alabama").get )
println( "Myoming: " + stateCapitals.get("Wyoming").getOrElse("Oops!") )
println( "Unkonwn: " + stateCapitals.get("Unknown").getOrElse("Oops2!") )
