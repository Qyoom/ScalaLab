package lab.case_classes_pattern_matching

object case_class_lab_1 extends App {
	
    abstract class Expr
  	case class Var(name: String) extends Expr
  	case class Number(num: Double) extends Expr
  	case class UnOp(operator: String, arg: Expr) extends Expr
  	case class BinOp(operator: String, left: Expr, right: Expr) extends Expr
  	
  	val v = Var("x")
	val opAdd = BinOp("+", Number(1), v)
	
	println(v.name)
	println(opAdd.left)
	println(opAdd)
	println(opAdd.right == Var("x"))
	println(opAdd.right == Var("z"))
	
	val opSubtract = opAdd.copy(operator = "-")

	// Pattern matching
	def simplifyTop(expr: Expr): Expr = expr match {
        case UnOp("-", UnOp("-", e)) => e
		case BinOp("+", e, Number(0)) => e
		case BinOp("*", e, Number(1)) => e
		case _ => expr
	}
}