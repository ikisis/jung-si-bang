object Queue{
  def apply[T](xs: T*) = new Queue[T](xs.toList, Nil)
}
class Queue[T] (
  private val leading: List[T],
  private val trailing: List[T]
) {

  def this() = this(Nil, Nil)

  private def mirror = 
    if (leading.isEmpty)
      new Queue(trailing.reverse, Nil)
    else
      this

  def head = mirror.leading.head

  def tail = {
    val q = mirror
    new Queue(q.leading.tail, q.trailing)
  }
  
  def enqueue(x: T) =
    new Queue(leading, x :: trailing)
}
