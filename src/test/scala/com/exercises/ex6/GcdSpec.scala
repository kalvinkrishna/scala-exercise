package com.exercises.ex6ex7

import org.scalatest.{ FunSpec, GivenWhenThen, Matchers }

class StringCommonSpec extends FunSpec with Matchers with GivenWhenThen {
  describe("StringCommon") {
    val words = "123 1234 1 12 123"
    Given(s"words of $words")

    it("longest word is 1234") {
      StringCommon.longest(words) should be ("1234")
    }

    it("commonest word is 123") {
      StringCommon.commonestWord(words) should be ("123")
    }

    it("commonest letter is '1'") {
      StringCommon.commonestLetter(words) should be ('1')
    }
  }

}
