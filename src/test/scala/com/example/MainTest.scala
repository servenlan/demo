package com.example

import org.scalatest.funspec.AnyFunSpec

class MainTest extends AnyFunSpec {
  describe("Main") {
    it("should demonstrate list operations") {
      val numbers = List(1, 2, 3, 4, 5)
      val doubled = numbers.map(_ * 2)
      assert(doubled == List(2, 4, 6, 8, 10))
    }
    
    it("should have working string operations") {
      val text = "Scala"
      assert(text.length == 5)
    }
  }
}
