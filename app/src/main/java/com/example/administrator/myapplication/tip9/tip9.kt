package com.example.administrator.myapplication.tip9

/**
 * Created by Administrator on 2018/2/26 0026.
 */
/*
* 常见的装饰器模式，为了修改部分的函数，却需要实现所有的接口函数
* */
class countingset<T>(val innerSet: MutableCollection<T> = HashSet<T>()):MutableCollection<T>{
  override val size: Int
    get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.

  override fun contains(element: T): Boolean {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun containsAll(elements: Collection<T>): Boolean {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun isEmpty(): Boolean {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun add(element: T): Boolean {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun addAll(elements: Collection<T>): Boolean {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun clear() {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun iterator(): MutableIterator<T> {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun remove(element: T): Boolean {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun removeAll(elements: Collection<T>): Boolean {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun retainAll(elements: Collection<T>): Boolean {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

}
