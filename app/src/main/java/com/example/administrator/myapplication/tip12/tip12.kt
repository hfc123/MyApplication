package com.example.administrator.myapplication.tip12

import android.content.Context
import android.widget.ImageView

/**
 * Created by Administrator on 2018/2/26 0026.
 * apply的使用
 */
fun strplus()=StringBuilder("start").apply {
  for (letter in 'A'..'Z'){
    this.append(letter)
  }
}.toString()
/*
* 用apply语句简化类的初始化，在类实例化的时候，就可以通过apply把需要初始化的步骤全部实现，非常的简洁
* */
fun testApply(context: Context) {
  var imgView = ImageView(context).apply {
    setBackgroundColor(0)
    setImageBitmap(null)
  }
}
