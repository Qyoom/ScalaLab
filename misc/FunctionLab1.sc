package misc

object FunctionLab1 {
	val nums = List(-15, -12, -5, -3, 0, 3, 5, 12, 15)
                                                  //> nums  : List[Int] = List(-15, -12, -5, -3, 0, 3, 5, 12, 15)
	nums.filter(x => x > 0)                   //> res0: List[Int] = List(3, 5, 12, 15)
	
	val divBy3 = {
		println("divBy3 called")
		(x: Int) => x % 3 == 0
	}                                         //> divBy3 called
                                                  //| divBy3  : Int => Boolean = <function1>
	nums.filter(divBy3)                       //> res1: List[Int] = List(-15, -12, -3, 0, 3, 12, 15)
	nums.partition(divBy3)                    //> res2: (List[Int], List[Int]) = (List(-15, -12, -3, 0, 3, 12, 15),List(-5, 5)
                                                  //| )
		
	def divBy5 = {
		println("divBy5 called")
		(x: Int) => x % 5 == 0
	}                                         //> divBy5: => Int => Boolean
	nums.partition(divBy5)                    //> divBy5 called
                                                  //| res3: (List[Int], List[Int]) = (List(-15, -5, 0, 5, 15),List(-12, -3, 3, 12)
                                                  //| )
	nums.filter(divBy5)                       //> divBy5 called
                                                  //| res4: List[Int] = List(-15, -5, 0, 5, 15)
	
	def divBy2(x: Int) = {
		println("divBy2 called")
		x % 2 == 0
	}                                         //> divBy2: (x: Int)Boolean
	nums.partition(divBy2)                    //> divBy2 called
                                                  //| divBy2 called
                                                  //| divBy2 called
                                                  //| divBy2 called
                                                  //| divBy2 called
                                                  //| divBy2 called
                                                  //| divBy2 called
                                                  //| divBy2 called
                                                  //| divBy2 called
                                                  //| res5: (List[Int], List[Int]) = (List(-12, 0, 12),List(-15, -5, -3, 3, 5, 15)
                                                  //| )
	nums.filter(divBy2)                       //> divBy2 called
                                                  //| divBy2 called
                                                  //| divBy2 called
                                                  //| divBy2 called
                                                  //| divBy2 called
                                                  //| divBy2 called
                                                  //| divBy2 called
                                                  //| divBy2 called
                                                  //| divBy2 called
                                                  //| res6: List[Int] = List(-12, 0, 12)
}