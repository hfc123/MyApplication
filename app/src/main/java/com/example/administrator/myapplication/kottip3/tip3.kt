package com.example.administrator.myapplication.kottip3

import android.content.Context
import android.content.res.Resources
import android.util.Log

/**
 * Created by Administrator on 2018/1/10 0010.
 */
fun printlidt(){
  val list= listOf<Int>(1,2,3)

  println(list)
}
/*
* 方法扩展
* */
fun <T> jointostring(collection:Collection<T>,sparator:String, prefix: String="[",
                     postfix: String="]"):String{
  val result=StringBuilder(prefix)
  for ((index,element) in collection.withIndex()){
    if (index>0)result.append(sparator)
    result.append(element)
  }
  result.append(postfix)
return result.toString()
}
fun joinstr(){
  val list= listOf<Int>(1,2,3)
//  val s=jointostring(list,"-","[","]")
  val s=jointostring(list,"-")
  Log.e("joinstr",s)
}

val Context.screemwidth get() = resources.displayMetrics.widthPixels
/**
 * returns dip(dp) dimension value in pixels
 * @param value dp
 */
fun Context.d2px(value:Int):Int=(value*resources.displayMetrics.density).toInt()
