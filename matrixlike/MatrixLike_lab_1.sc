package matrixlike

object MatrixLike_lab_1 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  def matxMult(m1: List[List[Double]], m2: List[List[Double]]): List[List[Double]] = {
  	
  	
  	
  	List(List(0.0)) // STUB - NIX
  }                                               //> matxMult: (m1: List[List[Double]], m2: List[List[Double]])List[List[Double]]
                                                  //| 
  
  val m1 = List(List(2.0,2.0), List(2.0,2.0), List(2.0,2.0), List(2.0,2.0))
                                                  //> m1  : List[List[Double]] = List(List(2.0, 2.0), List(2.0, 2.0), List(2.0, 2.
                                                  //| 0), List(2.0, 2.0))
  val m2 = List(List(3.0,3.0,3.0), List(3.0,3.0,3.0))
                                                  //> m2  : List[List[Double]] = List(List(3.0, 3.0, 3.0), List(3.0, 3.0, 3.0))
  
  matxMult(m1, m2)                                //> res0: List[List[Double]] = List(List(0.0))
  
 	def dotProd(v1: List[Double], v2: List[Double]): Double = {
    require(v1.length == v2.length, "dotProduct - Rows must be of equal length.")
    val zipped = v1 zip v2
    //println("zipped: " + zipped)
    val dotProdRes = zipped map {tup: (Double, Double) => tup._1 * tup._2} reduceLeft(_ + _)
    //println("dotProduct - result: " + dotProdRes)
    dotProdRes
  }                                               //> dotProd: (v1: List[Double], v2: List[Double])Double
  
  def transpose(m: List[List[Double]]): List[List[Double]] = { // Recursive
    if(m.head.isEmpty) Nil // convergence condition
    else {
	    val t_head: List[Double] = m.map(_ head) // forms a column made from the head of each row
	    val m_tails = m.map(_ tail) // forms a new matrix minus the former first column
	    val recurseTranspOfTails: List[List[Double]] = transpose(m_tails)
	    t_head :: recurseTranspOfTails // concatinate each new transposed "column" into a new List/Matrix
    }
	}                                         //> transpose: (m: List[List[Double]])List[List[Double]]
	
	def mXm(m1: List[List[Double]], m2: List[List[Double]]): List[List[Double]] = {
    for(m1row <- m1) yield
    for(m2col <- transpose(m2)) yield
    dotProd(m1row, m2col)
  }                                               //> mXm: (m1: List[List[Double]], m2: List[List[Double]])List[List[Double]]
}