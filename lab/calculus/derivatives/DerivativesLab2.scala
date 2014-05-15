package lab.calculus.derivatives

object DerivativesLab2 {
    import math._

    def main(args: Array[String]): Unit = {
        
        // functions to derive derviatives for
        def f1 = (x: Double) => pow(x,2)
        def f2 = (x: Double) => pow(x,2) * 1.5
        
        // input
        var x1 = 3
        var x2 = 7
        
        // results
        println("slope for f1 with x1=" + x1 + " and x2=" + x2 + " is " + 
                slope(f1, x1, x2))
        println("slope for f2 with x1=" + x1 + " and x2=" + x2 + " is " + 
                slope(f2, x1, x2))
        
        // new input
        x1 = 5
        x2 = 12
        
        // new results
        println("slope for f1 with x1=" + x1 + " and x2=" + x2 + " is " + 
                slope(f1, x1, x2))
        println("slope for f2 with x1=" + x1 + " and x2=" + x2 + " is " + 
                slope(f2, x1, x2))
    }
    
    def slope(f: Double => Double, x1: Double, x2: Double): Double = {
        val dx = delta(x1, x2)
        (f(x1 + dx) - f(x1)) / dx
    }
    
    def delta(x1: Double, x2: Double): Double = x2 - x1
}