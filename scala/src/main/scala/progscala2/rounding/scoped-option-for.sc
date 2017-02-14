
val dogBreeds = List(Some("Doberman"), None, Some("Yorkshire Terrier"),
                     Some("Dachshund"), None, Some("Scottish Terrier"),
                     None, Some("Great Dane"), Some("Protuguese Water Dog"))

println("first pass:")

for {
  breedOption <- dogBreeds
  breed <- breedOption
  upcasedBreed = breed.toUpperCase()
} println(upcasedBreed)

for {
  Some(breed) <- dogBreeds
  upcasedBreed = breed.toUpperCase()
} println(upcasedBreed)
