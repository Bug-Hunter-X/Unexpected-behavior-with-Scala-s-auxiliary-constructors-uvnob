```scala
class MyClass(val x: Int) {
  def this() = {
    this(0) // Explicitly call primary constructor with default value
    println("Auxiliary constructor called") //add logging to highlight the execution
  }

  def this(s:String) = this(s.toInt)
}

val obj = new MyClass()
println(obj.x) // Output: 0

val obj2 = new MyClass(5)
println(obj2.x) // Output: 5

val obj3 = new MyClass("10")
println(obj3.x) //Output: 10
```