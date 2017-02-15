object Breed extends Enumeration {
  type Breed = Value
  val deberman = Value("Doberman Pincher")
  val yorkie = Value("Yorkshire Terrier")
  val scotti = Value("Scottish Terrier")
  val dane = Value("Great Dane")
  val portie = Value("Protuguese Water Dog")
}
import Breed._

println("ID\tBreed")
for (breed <- Breed.values) println(s"${breed.id}\t$breed")

println("\nJust Terriers:")
Breed.values filter (_.toString.endsWith("Terrier")) foreach println
def isTerrier(b: Breed) = b.toString.endsWith("Terrier")

println("\nTerriers Again??")
Breed.values filter isTerrier foreach println
