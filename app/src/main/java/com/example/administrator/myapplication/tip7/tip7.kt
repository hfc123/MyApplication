package com.example.administrator.myapplication.tip7

/**
 * Created by Administrator on 2018/2/26 0026.
 */
class User(val id :Int,val name:String,val address:String,val email: String)

fun saveUser(user: User){
  if (user.name.isEmpty()){
    throw IllegalArgumentException("cannot save ${user.id}:empty username")
  }
}

/*
* 利用函数去除重复代码
* */
fun saveUser2(user: User){
  fun checkempty(value:String,field:String){
    if (value.isEmpty()){
      throw IllegalArgumentException("cannot save ${user.id}:empty $field")
    }
  }
  checkempty(user.name,"username")
}
