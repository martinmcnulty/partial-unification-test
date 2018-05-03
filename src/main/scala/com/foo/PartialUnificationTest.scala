package com.foo

import org.scalatest._

class PartialUnificationTest extends FlatSpec with Matchers {

  "Partial unification" should "not break the contains matcher on Map" in {
    Map("foo" -> "bar") should contain("foo" -> "bar")
  }

}
