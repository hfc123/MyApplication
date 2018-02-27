package com.example.administrator.myapplication.tip14

/**
 * Created by Administrator on 2018/2/26 0026.
 * 运算符的重载
 */
class Point(val x:Int,val y:Int){
  operator fun plus(other:Point):Point{
    return Point(x+other.x,y+other.y)
  }
  operator fun minus(other: Point):Point{
    return Point(x-other.x,y-other.y)
  }
  override fun toString(): String {
    return "$x---$y"
  }
}
fun testoperator(){
  val point1=Point(1,1);
  val point2=Point(1,1);
  val point3=point1+point2;
  println(point3)
  println(point1-point2)
}
