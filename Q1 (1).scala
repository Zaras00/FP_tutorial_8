package P8
import scala.io.StdIn.readDouble

object Q1 extends App{
  def interest(money: Double): Double = {
    money match {
      case money if money <= 20000 => money * 0.02;
      case money if money <= 200000 => money * 0.04;
      case money if money <= 2000000 => money * 0.035;
      case _ => money * 0.065;
    }
  }

  print("Enter the money: ");
  var money = readDouble();
  println(interest(money));
}
