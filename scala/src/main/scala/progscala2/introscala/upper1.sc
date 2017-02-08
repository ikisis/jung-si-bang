class Upper {
  def upper(strings: String*): Seq[String] = {
    strings.map(_.toUpperCase)
  }
}

val up = new Upper
println(up.upper("Hello", "World!"))
