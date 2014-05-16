package lab.calculus.derivatives

object DerivativesLab2 {
    import math._
    
    val deltaThreshold = 0.000001
    
    /* Calculates slope based on delta x and slope function as
     * x2 goes toward x1 and delta goes toward 0
     */
    def deriveSlope(f: Double => Double, x1: Double, x2: Double): Double = {
        
        def dx = delta(x1, x2)
        val slope = (f(x1 + dx) - f(x1)) / dx // TODO: Factor with other identical copy
        println("initial slope: " + slope)
        
        // Returns reduced delta; recursive
        def moveCloser(x1: Double, x2: Double): Double = {
            val dif = abs(x1 - x2)
			if(x2 > x1) x2 - dif * .99999
			else x2 + dif * .99999
		}
        
        // Returns slope with reduced delta
        def deriveSlope(x1: Double, x2: Double): Double = {
            val newX2 = moveCloser(x1, x2)
            val dx = delta(x1, newX2)
            val slope = (f(x1 + dx) - f(x1)) / dx // TODO: Factor with other identical copy
            println("deriveSlope - slope: " + slope)
            if(dx > deltaThreshold) deriveSlope(x1, newX2) // inner recursion
            else slope
        }
        
        if(dx > deltaThreshold) deriveSlope(x1, x2)
        else slope
    } // end outer deriveSlope
    
    def delta(x1: Double, x2: Double): Double = x2 - x1
}