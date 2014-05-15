package lab.calculus.derivatives

object DerivativesLab2 {
    import math._

    def main(args: Array[String]): Unit = {
        
        // functions to derive derviatives for
        def f1 = (x: Double) => pow(x,2)
        def f2 = (x: Double) => pow(x,2) * 1.5
        
        // some input
        var x1 = 3
        var x2 = 7
        
        // derivate results
        println("derivative for f1 with x1=" + x1 + " and x2=" + x2 + " is " + 
                deriv(f1, x1, x2))
        println("derivative for f2 with x1=" + x1 + " and x2=" + x2 + " is " + 
                deriv(f2, x1, x2))
        
        // some different input
        x1 = 5
        x2 = 12
        
        // new derivative results
        println("derivative for f1 with x1=" + x1 + " and x2=" + x2 + " is " + 
                deriv(f1, x1, x2))
        println("derivative for f2 with x1=" + x1 + " and x2=" + x2 + " is " + 
                deriv(f2, x1, x2))
    }
    
    
    
    def deriv(f: Double => Double, x1: Double, x2: Double): Double = {
        val dx = delta(x1, x2)
        (f(x1 + dx) - f(x1)) / dx
    }
    
    def delta(x1: Double, x2: Double): Double = x2 - x1
}