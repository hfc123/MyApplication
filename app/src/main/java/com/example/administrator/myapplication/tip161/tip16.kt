package com.example.administrator.myapplication.tip161

/**
 * Created by Administrator on 2018/2/27 0027.
 * 策略实施者
 * @param strategy lambda类型的策略
 */
class work(private val strategy:()->Unit){

  fun work(){
    println("START")
    strategy.invoke()
    println("end")
  }
}
fun test(){
  val work=work({
    println("11111")
  })
  val bStrategy = {
    println("Do B Strategy")
  }
  val work2=work(bStrategy)
  work.work()
  work2.work()
}
