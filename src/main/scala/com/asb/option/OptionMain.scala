package com.asb.option

object OptionMain {
  def main(args: Array[String]): Unit = {
    val numOption = Some(5)
      .map(num => num + 5)
      .map(num => num * 2)
      .map(num => num - 2)
      .filter(num => num % 2 == 0)
      .map(num => num * 5)
    println(numOption)

    val numOption2 = Some(5)
      .map(num => num + 5)
      .map(num => num * 2)
      .map(num => num - 2)
      .filter(num => num % 2 != 0)
      .map(num => num * 5)
    println(numOption2)

  }
}
