package lab.calculus.derivatives

import math._

object Derivatives_lab_1 {
	val x1 = 3                                //> x1  : Int = 3
	val x2 = 7                                //> x2  : Int = 7
	// the expected derivative
	2 * x1                                    //> res0: Int = 6

	// The function for which we're finding the derivative
	def f(x: Double) = pow(x,2)               //> f: (x: Double)Double
	
	
	def delta(x1: Double, x2: Double): Double = x2 - x1
                                                  //> delta: (x1: Double, x2: Double)Double
	var dx = delta(x1, x2)                    //> dx  : Double = 4.0

	//diagnostics during development
	//f(x1)
	//f(x1 + dx)
	//2 * x1 + dx
	
	// Slope formula
	def sf = (f(x1 + dx) - f(x1)) / dx        //> sf: => Double
	
	// Showing derivative as dx -> 0
	dx = 0.001
	sf                                        //> res1: Double = 6.000999999999479
	dx = 0.0001
	sf                                        //> res2: Double = 6.000100000012054
	dx = 0.00001
	sf                                        //> res3: Double = 6.000009999951316
	dx = 0.000001
	sf                                        //> res4: Double = 6.000001000927568
	
	
	
}