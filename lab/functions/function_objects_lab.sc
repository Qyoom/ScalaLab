package lab.functions

object function_objects_lab {
	
	def isEven(x: Int): Boolean = x % 2 == 0  //> isEven: (x: Int)Boolean
	
	(x: Int) => isEven(x)                     //> res0: Int => Boolean = <function1>
	
}