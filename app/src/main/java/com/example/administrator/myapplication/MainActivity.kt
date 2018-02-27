package com.example.administrator.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.administrator.myapplication.kottip2.javademo
import com.example.administrator.myapplication.kottip3.joinstr
import com.example.administrator.myapplication.kottip4.test4
import com.example.administrator.myapplication.kottip4.toast
import tip1.test2
import tip1.teststring1
class MainActivity : AppCompatActivity()  {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    teststring1()
    test2()
     val javademo= javademo();
    javademo.fun1();
    joinstr()
    toast()

    //tip4
    test4()
  }
}
