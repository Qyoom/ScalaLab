package lab.case_classes_pattern_matching

object case_class_lab_2 {
  
  abstract class Expr
  	case class Var(name: String) extends Expr
  	case class Number(num: Double) extends Expr
  	case class UnOp(operator: String, arg: Expr) extends Expr
  	case class BinOp(operator: String, left: Expr, right: Expr) extends Expr
  	
  	val x = Var("x")                          //> x  : lab.case_classes_pattern_matching.case_class_lab_2.Var = Var(x)
	val opAdd = BinOp("+", Number(1), x)      //> opAdd  : lab.case_classes_pattern_matching.case_class_lab_2.BinOp = BinOp(+,
                                                  //| Number(1.0),Var(x))
	// fields
	x.name                                    //> res0: String = x
	opAdd.left                                //> res1: lab.case_classes_pattern_matching.case_class_lab_2.Expr = Number(1.0)
	println(opAdd)                            //> BinOp(+,Number(1.0),Var(x))
	opAdd.right == Var("x")                   //> res2: Boolean = true
	opAdd.right == Var("z")                   //> res3: Boolean = false
	
	// copy function
	val opSubtract = opAdd.copy(operator = "-")
                                                  //> opSubtract  : lab.case_classes_pattern_matching.case_class_lab_2.BinOp = Bin
                                                  //| Op(-,Number(1.0),Var(x))

	// Pattern matching
	def identity(expr: Expr): Expr = expr match {
    case UnOp("-", UnOp("-", e)) => e
		case BinOp("+", e, Number(0)) => e
		case BinOp("*", e, Number(1)) => e
		case _ => expr
	}                                         //> identity: (expr: lab.case_classes_pattern_matching.case_class_lab_2.Expr)lab
                                                  //| .case_classes_pattern_matching.case_class_lab_2.Expr
	
	val var_x = UnOp("-", UnOp("-", x))       //> var_x  : lab.case_classes_pattern_matching.case_class_lab_2.UnOp = UnOp(-,Un
                                                  //| Op(-,Var(x)))
  identity(var_x) == Var("x")                     //> res4: Boolean = true
  
  def typeCheck(e: Expr) = e match {
  		case UnOp(op, _) => println("got UnOp of type: " + op)
  		case BinOp(op, left, right) => println("got BinOp")
  		case Number(num) => println("got number: " + num)
  		case _ => println("something else")
  }                                               //> typeCheck: (e: lab.case_classes_pattern_matching.case_class_lab_2.Expr)Unit
                                                  //| 
  
  typeCheck(var_x)                                //> got UnOp of type: -
  typeCheck(Number(7))                            //> got number: 7.0
  
  // Constants
  def describe(x: Any) = x match {
    case 5 => "five"
    case true => "truth"
    case "hello" => "hi!"
    case Nil => "the empty list"
    case _ => "something else"
  }                                               //> describe: (x: Any)String
  
  describe(5)                                     //> res5: String = five
  describe(true)                                  //> res6: String = truth
  describe("hello")                               //> res7: String = hi!
  describe(List())                                //> res8: String = the empty list
  describe(Var("x"))                              //> res9: String = something else
  
  // Variable pattern
  def variable(v: Any) {
  		v match {
          case 0 => println("zero")
          case somethingElse => println("not zero: "+ somethingElse)
		}
	}                                         //> variable: (v: Any)Unit
	
	variable(0)                               //> zero
	variable(Var("x"))                        //> not zero: Var(x)
}