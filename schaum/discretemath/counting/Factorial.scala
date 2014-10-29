package schaum.discretemath.counting

object Factorial extends Application {
    
	def fac(n: Int): Int = {
	    if (n < 0) throw new IllegalArgumentException("Input must be greater than 0")
	    val orig = n // diagnostic
	    def recurse(n: Int, prod: Int): Int = {
	        if (n <= 1) {
	            println("fac(" + orig + "): " + prod)
	            prod // return result
	        }
	        else recurse(n-1, n*prod)
	    }
	    recurse(n, 1)
	}
	
	/*
	println("fac(5): " + fac(5))
	println("fac(0): " + fac(0))
	println("fac(1): " + fac(1))
	println("fac(2): " + fac(2))
	println("fac(10): " + fac(10))
	*/
	//println(fac(-1)) // exception thrown
	
	//println("fac(52): " + fac(52)) // NOT ABLE TO HANDLE BIG NUMBERS LIKE THIS!!
	
}