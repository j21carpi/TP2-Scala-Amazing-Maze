package maze

import maze.Maze.*
import scala.collection.mutable.ListBuffer


object Main extends App{

  val leaf2 = Leaf("2")
  val leaf4 = Leaf("4")
  val leaf5 = Leaf("5")
  val leaf8 = Leaf("8")
  val branch3 = Branch("3", leaf4, leaf5)
  val branch1 = Branch("1", leaf2, branch3)
  val branch7 = Branch("7", leaf5, leaf8)
  val branch6 = Branch("6", branch3, branch7)
  val branch0 = Branch("0", branch1, branch6)

  val trace = ListBuffer.empty[String]
  branch0.explore(trace)

  System.out.println(trace)
}
