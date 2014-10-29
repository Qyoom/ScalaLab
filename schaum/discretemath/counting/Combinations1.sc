package schaum.discretemath.counting
import schaum.discretemath.counting.Factorial._
import schaum.discretemath.counting.BinomialTheorem._

object Combinations1 {
  println("Schaum Combinations, p.93")            //> Schaum Combinations, p.93
  
  // C(n, r) * r!
  binomialCoeficients(4, 3) * fac(3)              //> fac(3): 6
                                                  //| res0: Double = 24.0
  // C(n, r)
  // Example 5.8, p.94
  // ans: 14000
  val cows = binomialCoeficients(6, 3)            //> cows  : Double = 20.0
  val pigs = binomialCoeficients(5, 2)            //> pigs  : Double = 10.0
  val chickens = binomialCoeficients(8, 4)        //> chickens  : Double = 70.0
  cows * pigs * chickens                          //> res1: Double = 14000.0
}