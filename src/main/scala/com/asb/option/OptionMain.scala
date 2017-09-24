package com.asb.option

object OptionMain {

  def sqrt(num: Int): Option[Double] =
    if (num < 0) None
    else Some(Math.sqrt(num))

  def main(args: Array[String]): Unit = {
    val numOption = Some(5)
    val sqrtNum = numOption.flatMap(num => sqrt(num))

    println(sqrtNum)
  }
}
