package com.example.administrator.myapplication.tip10

import android.content.Context
import android.widget.TextView

/**
 * Created by Administrator on 2018/2/26 0026.
 */
fun testlamab(context: Context){
val textview=TextView(context)
  textview.setOnClickListener{
    //todo
  }
}
//创建接口
interface Shape{
  fun draw()
}
//实现此接口的修饰类
class XiuShiShape:Shape{
  override fun draw() {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  println("draw 三角形 ")
  }
}
class RectShape(shap:XiuShiShape) :Shape by shap;
fun testby(){
    val b=XiuShiShape();
     b.draw();
}
