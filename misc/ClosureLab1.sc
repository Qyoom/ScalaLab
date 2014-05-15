package misc

class Class1 {

	val free = 3

	def multByFree(x: Int) = x * free
	
	List(1, 2, 3).map(multByFree)
}

object Objec2 {

	val cl1 = new Class1                      //> cl1  : misc.Class1 = misc.Class1@1d807ca8
	
	List(4, 5, 6).map(cl1.multByFree)         //> res0: List[Int] = List(12, 15, 18)
}