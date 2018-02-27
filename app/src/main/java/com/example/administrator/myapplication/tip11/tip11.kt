package com.example.administrator.myapplication.tip11

/**
 * Created by Administrator on 2018/2/26 0026.
 * 通过with将result作为参数传人，在内部就可以通过this来表示result变量了
 */
fun test():String {
  val result=StringBuilder();
  return with(result) {
    result.append("START")
    for (letter in 'A'..'Z'){
      result.append(letter)
    }
  }.toString()
}
