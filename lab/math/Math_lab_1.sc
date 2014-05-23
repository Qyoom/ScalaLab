package lab.math
import math._
object Math_lab_1 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  log(6)                                          //> res0: Double = 1.791759469228055
  
  /* http://stackoverflow.com/questions/11106886/scala-doubles-and-precision
   * double n and precision p, using currying */
  def roundAt(prec: Int)(n: Double): Double = {
  	val scale = math pow(10, prec)
  	println("scale: " + scale)
  	(math round n * scale) / scale
  }                                               //> roundAt: (prec: Int)(n: Double)Double
  
  /* Foundations of Statistical Natural Language Processing, p580 */
  val raw = 10 * ((1 + log(6)) / (1 + log(89)))   //> raw  : Double = 5.086435466236399
  
  roundAt(2)(raw)                                 //> scale: 100.0
                                                  //| res1: Double = 5.09
  
}