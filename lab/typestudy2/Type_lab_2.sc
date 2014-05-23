package lab.typestudy2

object Type_lab_2 {
	println("type declarations are buggy in worksheet - \n" +
		"Needs this friggin println!!")   //> type declarations are buggy in worksheet - 
                                                  //| Needs this friggin println!!
	type Froik = List[Int]
	def Froik(x: Int*) = List(x: _*)          //> Froik: (x: Int*)List[Int]
	
	// http://www.scala-lang.org/old/node/105.html
	abstract class Buffer {
		type T // abstract
		val element: T // deferred value definition
	}
	
	abstract class SeqBuffer extends Buffer {
		type U
		type T <: Seq[U]
		def length = element.length
	}
	
	abstract class IntSeqBuffer extends SeqBuffer {
		type U = Int
	}
	
		def newIntSeqBuffer(elem1: Int, elem2: Int): IntSeqBuffer = {
			new IntSeqBuffer {
				type T = List[U]
				val element = List(elem1, elem2)
			}
		}                                 //> newIntSeqBuffer: (elem1: Int, elem2: Int)lab.typestudy2.Type_lab_2.IntSeqBuf
                                                  //| fer
		val buf = newIntSeqBuffer(7, 8)   //> buf  : lab.typestudy2.Type_lab_2.IntSeqBuffer = lab.typestudy2.Type_lab_2$$a
                                                  //| nonfun$main$1$$anon$1@1d3c468a
		println("length: " + buf.length)  //> length: 2
		println("element: " + buf.element)//> element: List(7, 8)
		buf                               //> res0: lab.typestudy2.Type_lab_2.IntSeqBuffer = lab.typestudy2.Type_lab_2$$an
                                                  //| onfun$main$1$$anon$1@1d3c468a
}