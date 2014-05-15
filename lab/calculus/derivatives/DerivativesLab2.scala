package lab.calculus.derivatives

object DerivativesLab2 {
    import math._

    def main(args: Array[String]): Unit = {
        
        // Two different functions to derive derviatives for
        def f1 = (x: Double) => pow(x,2)
        def f2 = (x: Double) => pow(x,2) * 1.5
        
        // same input for each
        var x1 = 3
        var x2 = 7
        
        // derivate results for each
        println("derivative for f1 with x1=" + x1 + " and x2=" + x2 + " is " + 
                deriv(f1, x1, x2))
        println("derivative for f2 with x1=" + x1 + " and x2=" + x2 + " is " + 
                deriv(f2, x1, x2)  + "\n")
                
        // reverse same input
        x1 = 7
        x2 = 3
        
        // derivate results
        println("derivative for f1 with x1=" + x1 + " and x2=" + x2 + " is " + 
                deriv(f1, x1, x2))
        println("derivative for f2 with x1=" + x1 + " and x2=" + x2 + " is " + 
                deriv(f2, x1, x2)  + "\n")
        
        // some different input
        x1 = 5
        x2 = 12
        
        // new derivative results
        println("derivative for f1 with x1=" + x1 + " and x2=" + x2 + " is " + 
                deriv(f1, x1, x2))
        println("derivative for f2 with x1=" + x1 + " and x2=" + x2 + " is " + 
                deriv(f2, x1, x2)  + "\n")
                
        // some input with negative values
        x1 = -5
        x2 = 12
        
        // new derivative results
        println("derivative for f1 with x1=" + x1 + " and x2=" + x2 + " is " + 
                deriv(f1, x1, x2))
        println("derivative for f2 with x1=" + x1 + " and x2=" + x2 + " is " + 
                deriv(f2, x1, x2)  + "\n")
    } // end - main
        
    /* Calculates derivative based on delta(x) and slope function as
     * x2 goes toward x1 and delta goes toward 0
     */ 
    def deriv(f: Double => Double, x1: Double, x2: Double): Double = {
        // delta
        val dx = delta(x1, x2)
        // slope
        val slope = (f(x1 + dx) - f(x1)) / dx
        // iterate dx -> 0
        
    }
    
    def delta(x1: Double, x2: Double): Double = x2 - x1
}