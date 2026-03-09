package com.example

object Main {
  def main(args: Array[String]): Unit = {
    println("Hello from Scala!")
    
    // Example: Simple list operations
    val numbers = List(1, 2, 3, 4, 5)
    val doubled = numbers.map(_ * 2)
    println(s"Original: $numbers")
    println(s"Doubled: $doubled")
    
    
    // Example: Function definition
    def greet(name: String): String = s"Hello, $name!"
    println(greet("World"))
  }
}
