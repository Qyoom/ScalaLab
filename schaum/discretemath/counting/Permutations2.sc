package schaum.discretemath.counting
import schaum.discretemath.counting.Factorial._

// EXAMPLE 5.5
object Permutations2 {
  println("Schaum Permutations, EXAMPLE 5.5")     //> Schaum Permutations, EXAMPLE 5.5
  
  def numPerms(n: Int)(r: Int*): Int = {
  		// recursive
  		def denom(d: List[Int], acc: Int): Int = {
  			println("d: " + d + " | acc: " + acc)
	  		d match {
	  			case Nil => acc
	  			case x :: xs => {
	  				denom(xs, fac(x) * acc) // recurse
	  			}
	  		}
	  	}
  		fac(n) / denom(r.toList, 1)
  } // end numPerms                               //> numPerms: (n: Int)(r: Int*)Int
  
  /********** EXAMPLES **********/
  numPerms(7)(3,2)                                //> Factorial.fac n: 7
                                                  //| Factorial.fac.recurse n: 7
                                                  //| Factorial.fac.recurse n: 6
                                                  //| Factorial.fac.recurse n: 5
                                                  //| Factorial.fac.recurse n: 4
                                                  //| Factorial.fac.recurse n: 3
                                                  //| Factorial.fac.recurse n: 2
                                                  //| Factorial.fac.recurse n: 1
                                                  //| d: List(3, 2) | acc: 1
                                                  //| Factorial.fac n: 3
                                                  //| Factorial.fac.recurse n: 3
                                                  //| Factorial.fac.recurse n: 2
                                                  //| Factorial.fac.recurse n: 1
                                                  //| d: List(2) | acc: 6
                                                  //| Factorial.fac n: 2
                                                  //| Factorial.fac.recurse n: 2
                                                  //| Factorial.fac.recurse n: 1
                                                  //| d: List() | acc: 12
                                                  //| res0: Int = 420
}