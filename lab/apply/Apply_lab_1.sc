package lab.apply

object Apply_lab_1 {
  
  class Foo(x: Int) {
  		def apply(y: Int): Int = {
  			x*x + y*y
  		}
  		def apply(s: String): String = {
  			s + s
  		}
  }
  
  val f = new Foo(3)                              //> f  : lab.apply.Apply_lab_1.Foo = lab.apply.Apply_lab_1$Foo@45b9ce4b
  
  f(6)                                            //> res0: Int = 45
  f("huh")                                        //> res1: String = huhhuh
  
}