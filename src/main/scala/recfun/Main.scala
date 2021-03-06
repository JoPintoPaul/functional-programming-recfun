package recfun

import scala.annotation.tailrec

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
    * Exercise 1
    */
  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || c == r) 1
    else pascal(c - 1, r - 1) + pascal(c, r - 1)
  }

  /**
    * Exercise 2
    */
  def balance(chars: List[Char]): Boolean = {
    @tailrec
    def balanceWithOpenCount(chars: List[Char], unclosed: Int): Boolean = {
      if (chars.isEmpty) unclosed == 0
      else {
        val unbalanced: Int = chars.head match {
          case '(' => unclosed + 1
          case ')' => unclosed - 1
          case _ => unclosed
        }
        if (unbalanced < 0) false
        else balanceWithOpenCount(chars.tail, unbalanced)
      }
    }
    balanceWithOpenCount(chars, 0)
  }

  /**
    * Exercise 3
    */
  def countChange(money: Int, coins: List[Int]): Int = {
    1022
  }
}
