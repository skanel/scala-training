//1.Implicit parameter
def payLoan(amount: Float)(implicit interestRate: Float): Float = amount + amount * interestRate

//payLoan(2201100)(3.0F) // Success
//payLoan(2201100) // Will cause error

//implicit val interestRate: Float = 2.0F
//payLoan(2201100) // Will cause error

//////////////////////////////////////////////////////

object Bank {

	implicit def interestRate(implicit isFriend: Boolean): Float = if (isFriend) 0.3F else 0.5F

}

import Bank.interestRate

implicit val isFriend = true
payLoan(2201100)
// => res5: Float = 2861430.0
//////////////////////////////////////////////////////

//2. Implicit conversion
3 ** 4 // Will cause error

implicit class Utils (val x: Int) {
	 def **(y: Int) = scala.math.pow(x, y)
}
2 ** 3
//<console>:11: error: value ** is not a member of Int
//3. standard lib implicit conversion

(1, 2, 3) < (1, 2, 4) // Obviously, this will cause error

import scala.math.Ordering.Implicits._ // Import implicit conversion for comparing 2 tuples
import scala.math.Ordering.Implicits._
(1,2,3) < (1,2,4)



//More example:
/*
object Helpers {
	implicit class adssadasdasd(x: Int) {
		def times[A](f: => A): Unit = {
			def loop(current: Int): Unit =
				if(current > 0) {
					f
					loop(current - 1)
				}
			loop(x)
		}
	}
}

import Helpers._
5 times println("HI")
*/
//Restrictions
//1. They must be defined inside of another trait/class/object.

object Helpers {
	implicit class RichInt(x: Int) // OK!
}
implicit class RichDouble(x: Double) // BAD!

//Restrictions
//2. They may only take one non-implicit argument in their constructor.
/*
implicit class RichDate(date: java.util.Date) // OK!
implicit class Indexer[T](collecton: Seq[T], index: Int) // BAD!
implicit class Indexer[T](collecton: Seq[T])(implicit index: Index) // OK!
*/
//Restrictions
//3. There may not be any method, member or object in scope with the same name as the implicit class.

object Bar
implicit class Bar(x: Int) // BAD!

val x = 5
implicit class x(y: Int) // BAD!

//Note: This means an implicit class cannot be a case class
implicit case class Baz(x: Int) // BAD!


// More example
// probably in a library

class Prefixer(val prefix: String)
def addPrefix(s: String)(implicit p: Prefixer) = p.prefix + s

// then probably in your application
implicit val myImplicitPrefixer = new Prefixer("***")
addPrefix("abc")  // returns "***abc"


///So the difference between your methods is that the one marked implicit

//implicit def doubleToInt(d: Double) = d.toInt
//val x: Int = 42.0
//will work the same as

//def doubleToInt(d: Double) = d.toInt
//val x: Int = doubleToInt(42.0)
//good noted
def example1(implicit x: Int)                       // x is implicit
def example2(implicit x: Int, y: Int)               // x and y are implicit
def example3(x: Int, implicit y: Int)               // wont compile
def example4(x: Int)(implicit y: Int)               // only y is implicit
def example5(implicit x: Int)(y: Int)               // wont compile
def example6(implicit x: Int)(implicit y: Int)      // wont compile
