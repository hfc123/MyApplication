package tip1

/**
 * Created by Administrator on 2018/1/9 0009.
 */
fun teststring1(){

  val sting1="""hello kotlin \n
      hello kotlin2
  """.trimMargin()
  val str2=""" nnn \n
      ssssss
  """.trimMargin()
  println(sting1)
  println(str2)
  val strlist= arrayListOf("aaaaa1","bbbb2","ccccc3")
  println("拼接$strlist")
  println("拼接${strlist[0]}")
  println("拼接2${if (strlist.size>0)strlist[0]else "null"}")

}

/*外部能否调用 strlist*/
fun test2(){
  println("拼接\$strlist")
  println("First content is ${'$'}strings")
}
