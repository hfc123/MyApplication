package com.example.administrator.myapplication.kottip4

import android.app.Activity
import android.util.Log
import android.widget.Toast

/**
 * Created by Administrator on 2018/1/10 0010.
 */
/*
* show toast in activity
*
* */
fun Activity.toast(){
  Toast.makeText(this,"sss",Toast.LENGTH_SHORT).show()
}
/*
* 属性扩展
* */
val String.lastchar:Char
get() = get(length-1)
var StringBuilder.lastchar:Char
get() = get(length-1)
set(value:Char){
  setCharAt(length-1,value)
}

fun test4(){
  val s="abc"
  Log.e("tip4",s.lastchar.toString())
  val s1=StringBuilder(s)
  Log.e("tip4",s1.lastchar.toString())
}
