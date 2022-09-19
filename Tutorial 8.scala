import math.{sqrt,pow}

case class Point(a:Int,b:Int){
  def x:Int=a
  def y:Int=b

  //Question 1- Adding two given points
  def move(dx:Int,dy:Int)= Point(this.x+dx,this.y+dy)

  //Question 2-Move a point by a given distance
  def +(that:Point)= Point(this.x+that.x, this.y+that.y)

  //Question 3-Distance between two given points
  def distance(other:Point):Double = sqrt(pow(this.x - other.x, 2) + pow(this.y - other.y, 2))

  //Question 4-Switch the x and y coordinates
  def invert()= Point(this.y,this.x)
}

object MyApp extends App{
  val p1= new Point(9,7)
  val p2=new Point(3,2)
  println(s"Addition = ${p1+p2}")

  val p3=p1.move(2,3)
  println(s"after move = ${p3}")

  val d= p1.distance(p2)
  println(f"Distance = ${d}%.2f")
  print("point p1 :")
  println(p1) 
   
  println(s"Invert p1= ${p1.invert()}")
}


