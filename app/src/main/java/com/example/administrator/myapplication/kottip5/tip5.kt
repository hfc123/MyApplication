package com.example.administrator.myapplication.kottip5

/**
 * Created by Administrator on 2018/1/11 0011.
 * 延迟初始化
 * 用到时才会初始化
 */
class User(var name:String,var age: Int)

var user=User("wang",16)

val user1:User by lazy {
  User("li",15)
}
