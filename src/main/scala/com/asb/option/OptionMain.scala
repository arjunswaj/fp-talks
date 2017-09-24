package com.asb.option

object OptionMain {

  def sum(a: Int, b: Int): Int =
    a + b

  def main(args: Array[String]): Unit = {
    val a = Some(5)
    val b = Some(6)

    // val res = a.flatMap(num1 => b.map(num2 => num1 + num2))

    val res = for {
      num1 <- a
      num2 <- b
    } yield num1 + num2

    println(res)
  }
}
