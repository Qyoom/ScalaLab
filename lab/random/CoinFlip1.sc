package lab.random

object CoinFlip1 {
  val randGen = new scala.util.Random             //> randGen  : scala.util.Random = scala.util.Random@4bdb699b
  
  val outcome = Map(
    		0 -> "H",
    		1 -> "T"
	)                                         //> outcome  : scala.collection.immutable.Map[Int,String] = Map(0 -> H, 1 -> T)
  
  def flip = randGen.nextInt(2)                   //> flip: => Int
  
  //-------------------------------------------/
    for(
    		i <- 1 to 10
    ) yield { println(outcome(flip)) }            //> T
                                                  //| T
                                                  //| T
                                                  //| T
                                                  //| T
                                                  //| H
                                                  //| T
                                                  //| H
                                                  //| T
                                                  //| T
                                                  //| res0: scala.collection.immutable.IndexedSeq[Unit] = Vector((), (), (), (), (
                                                  //| ), (), (), (), (), ())
    
}