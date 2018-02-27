@file:JvmName("tip2name")
package tip2

import android.nfc.Tag
import android.util.Log

/**
 * Created by Administrator on 2018/1/10 0010.
 * 1.java与kotlin互相调用
 */

fun test3(){
  Log.e("ss","sss")
}
/*
* if when都是判定
* */

fun tipfun2(){
  val ss=true;
  if (ss){
    Log.e("tipfun2","true")
  }else{
    Log.e("tipfun2","false")
  }
}
fun max(a: Int, b: Int): Int {
  return if (a > b) a else b
}
fun max2(a:Int,b:Int)=if (a>b) a else b

/*\
* when 的使用方法
* */

fun testwhen(gread:String) = when{
  gread=="A" ->{
    Log.e("when","A")
    "AAAA"}
  else ->"bbbb"
}
fun testwhen2(a:Int)=when(a){
  1 -> {
  Log.e("when","1")
    1
  }
   2 -> 2
  else ->3
}
