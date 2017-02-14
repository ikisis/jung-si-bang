
val dogBreeds = List("Doberman", "Yorkshire Terrier", "Dachshund",
                     "Scottish Terrier", "Great Dane", "Portuguese Water Dog")

for (breed <- dogBreeds
  if breed.contains("Terrier")
  if !breed.startsWith("Yorkshire")
) println(breed)

for (breed <- dogBreeds
  if breed.contains("Terrier") && !breed.startsWith("Yorkshire")
) println(breed)
