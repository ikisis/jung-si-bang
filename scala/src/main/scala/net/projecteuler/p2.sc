/*
Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
*/

def fib(acc: Long, a: Long, b: Long, c: Long): Long = 
  if (b > 4000000L) acc
  else {
    val a0 = b + c
    val b0 = c + a0
    fib(acc + b, a0, b0, a0 + b0)
  }

println(fib(0, 1, 2, 3))
