package com.asb.option

object OptionMain {

  def main(args: Array[String]): Unit = {
    val a = Some(5)
    val b = Some(6)
    val c = Some(7)
    val d = Some(8)

    val res2 = a.flatMap(num1 => b
      .filter(num2 => num1 + num2 > 66)
      .flatMap(num2 => c.flatMap(num3 => d.map(num4 => num1 + num2 + num3 + num4))))

    println(res2)

    val res = for {
      num1 <- a
      num2 <- b if (num1 + num2) > 66
      num3 <- c
      num4 <- d
    } yield num1 + num2 + num3 + num4

    println(res)
  }
}
