package com.alejandrojdf.example

trait MenuServices {

  //val menu = Map("cola" -> List(50,"C"),"coffee" -> List(1,"H"),"cheese sandwich" -> List(2,"C"),"steak sandwich" -> List(4.5,"H"))

  val menuList = Map("cola" -> (0.5,"C"), "coffee" -> (1.0,"H"), "cheese sandwich" -> (2.0, "C"), "steak sandwich" -> (4.5, "H"))

  def getSurcharge(menu: List[String]): Double = {
    if (menu.contains("Steak Sandwich")) {
      0.2
    } else if (menu.contains("Cheese Sandwich")) {
      0.1
    } else
      1
  }
  
}
