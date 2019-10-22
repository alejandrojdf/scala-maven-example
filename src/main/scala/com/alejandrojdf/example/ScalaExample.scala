package com.alejandrojdf.example

import scala.collection.mutable.ArrayBuffer

object ScalaExample extends App with MenuServices {
//Cola,Coffee,Cheese Sandwich returns 3.5 and 3.85
  val items = scala.io.StdIn.readLine().split(",")

  val foodNames = ArrayBuffer[String]()
  var foodTotal: Double = 0

  for (i <- items){
    val itemDetail = menuList(i.toLowerCase)
    val price: Double = itemDetail._1.asInstanceOf[Double]

    foodNames += i
    foodTotal = foodTotal + price

  }
  println(foodNames.toList.mkString(","))
  val surcharge = getSurcharge(foodNames.toList)

  val subtotal = foodTotal
  val total = (subtotal * surcharge) + subtotal

  println(s"Sub Total = $subtotal")
  println(s"Total = $total")

}
