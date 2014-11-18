package lab.math
import math._

object logarithm_lab {

	//package scala
	/** The package object `scala.math` contains methods for performing basic
	  * numeric operations such as elementary exponential, logarithmic, root and
	  * trigonometric functions.
	  */
	//package object math
	
	// Users/hieronymus/Development/Math/Aleks/Reference/Logarithms.rtfd

	// def log(x: Double): Double = java.lang.Math.log(x)
	// natural logarithm
  log(1)                                          //> res0: Double = 0.0
  log(E)                                          //> res1: Double = 1.0
  log(10)                                         //> res2: Double = 2.302585092994046
  log(2)                                          //> res3: Double = 0.6931471805599453
  
  // https://groups.google.com/forum/#!topic/scala-language/K5tbYSYqQc8
  def log2(x: Double) = scala.math.log(x)/scala.math.log(2)
                                                  //> log2: (x: Double)Double
  log2(1)                                         //> res4: Double = 0.0
  log2(2)                                         //> res5: Double = 1.0
  log2(4)                                         //> res6: Double = 2.0
  log2(8)                                         //> res7: Double = 3.0
  
  log2(pow(2,4))                                  //> res8: Double = 4.0
  log2(pow(2,8))                                  //> res9: Double = 8.0
  
  // https://groups.google.com/forum/#!topic/scala-language/K5tbYSYqQc8
  def log3(x: Double) = scala.math.log(x)/scala.math.log(3)
                                                  //> log3: (x: Double)Double
  log3(1)                                         //> res10: Double = 0.0
  log3(3)                                         //> res11: Double = 1.0
  log3(9)                                         //> res12: Double = 2.0
  log3(27)                                        //> res13: Double = 3.0
  
  // https://groups.google.com/forum/#!topic/scala-language/K5tbYSYqQc8
  def log4(x: Double) = scala.math.log(x)/scala.math.log(4)
                                                  //> log4: (x: Double)Double
  log4(1)                                         //> res14: Double = 0.0
  log4(4)                                         //> res15: Double = 1.0
  log4(3)                                         //> res16: Double = 0.7924812503605781
  log4(64)                                        //> res17: Double = 3.0
  
  // https://groups.google.com/forum/#!topic/scala-language/K5tbYSYqQc8
  def log5(x: Double) = scala.math.log(x)/scala.math.log(5)
                                                  //> log5: (x: Double)Double
  log5(1)                                         //> res18: Double = 0.0
  log5(5)                                         //> res19: Double = 1.0
  log5(25)                                        //> res20: Double = 2.0
  log5(125)                                       //> res21: Double = 3.0000000000000004
  
  // https://groups.google.com/forum/#!topic/scala-language/K5tbYSYqQc8
  def log16(x: Double) = scala.math.log(x)/scala.math.log(16)
                                                  //> log16: (x: Double)Double
  log16(1)                                        //> res22: Double = 0.0
  log16(4)                                        //> res23: Double = 0.5
  log16(8)                                        //> res24: Double = 0.75
  log16(16)                                       //> res25: Double = 1.0
  log16(32)                                       //> res26: Double = 1.25
  
  log16(pow(16,3))                                //> res27: Double = 3.0
  
   /** Returns the base 10 logarithm of the given `Double` value. */
	 //def log10(x: Double): Double = java.lang.Math.log10(x)
   log10(10)                                      //> res28: Double = 1.0
   log10(100)                                     //> res29: Double = 2.0
   log10(1000)                                    //> res30: Double = 3.0
   log10(.1)                                      //> res31: Double = -1.0
    
  /** Returns Euler's number `e` raised to the power of a `double` value.
   *
   *  @param  x the exponent to raise `e` to.
   *  @return the value `e^a^`, where `e` is the base of the natural
   *          logarithms.
   */
   exp(1)                                         //> res32: Double = 2.7182818284590455
   exp(10)                                        //> res33: Double = 22026.465794806718
   exp(2)                                         //> res34: Double = 7.38905609893065
   
   //.....................//
   
   log5(125)                                      //> res35: Double = 3.0000000000000004
   log5(25)                                       //> res36: Double = 2.0
   log5(1000)                                     //> res37: Double = 4.29202967422018
   log5(25 * 1000)                                //> res38: Double = 6.29202967422018
   log5(25) + log5(1000)                          //> res39: Double = 6.29202967422018
   log5(25 * 125)                                 //> res40: Double = 5.0
   log5(25) + log5(125)                           //> res41: Double = 5.0
   
   //-------------------------------------//
   
   // Generic exponential function
   // a is the base, s is the exponent, x is the s'th power of a.
   def expFunc(a: Double, s: Double): Double = {
		 val x = pow(a, s)
		 x
   }                                              //> expFunc: (a: Double, s: Double)Double
   
   // Generic logarithmic function
   // a is the base, s is the exponent, x is the s'th power of a.
   def logFunc(a: Double, x: Double): Double = {
		 val s = scala.math.log(x)/scala.math.log(a)
		 s
   }                                              //> logFunc: (a: Double, x: Double)Double
   
   //...................//
   
   expFunc(4, 3)                                  //> res42: Double = 64.0
   logFunc(4, 64)                                 //> res43: Double = 3.0
}