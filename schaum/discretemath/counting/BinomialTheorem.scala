package schaum.discretemath.counting

object BinomialTheorem extends App {
    
    // recursive
    def binomialCoeficients(n: Int, r: Int, n_acc: Int, r_acc: Int): Double = {
        //println("n:" + n + " r:" + r + " n_acc:" + n_acc + " r_acc:" + r_acc)
        
        if (r >= 1) {
            val new_n_acc = n_acc * n
            val new_r_acc = r_acc * r
            binomialCoeficients(n-1, r-1, new_n_acc, new_r_acc)
        }
        
        else {
            n_acc.toDouble / r_acc.toDouble
        }
    }
    
    /********** inits ****************/
    
    val bn_10_7 = binomialCoeficients(10, 7, 1, 1)
    println("------> bn_10_7: " + bn_10_7)
    
    val bn_10_3 = binomialCoeficients(10, 3, 1, 1)
    println("------> bn_10_3: " + bn_10_3)
    
    val bn_12_8 = binomialCoeficients(12, 8, 1, 1)
    println("------> bn_12_8: " + bn_12_8)
    
    val bn_12_4 = binomialCoeficients(12, 4, 1, 1)
    println("------> bn_12_4: " + bn_12_4)
    
    val bn_13_8 = binomialCoeficients(13, 8, 1, 1)
    println("------> bn_13_8: " + bn_13_8)
    
    val bn_13_5 = binomialCoeficients(13, 5, 1, 1)
    println("------> bn_13_5: " + bn_13_5)
}