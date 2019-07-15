package com.queue
import scala.collection.mutable.ListBuffer
trait Queue{
  def enqueue(x : Int,listBuffer: ListBuffer[Int]):ListBuffer[Int]
  def dequeue(listBuffer: ListBuffer[Int]):ListBuffer[Int]
}
object Main extends App {
  var list = new  ListBuffer[Int]
  var obj = new DoubleEnqueue
  obj.enqueue(2,list)
  obj.enqueue(3,list)
  obj.enqueue(4,list)
  obj.dequeue(list)
  println(list)
  var obj2 = new SquareEnqueue
  obj2.enqueue(2,list)
  obj2.enqueue(3,list)
  obj2.dequeue(list)
  obj2.dequeue(list)
  println(list)
}