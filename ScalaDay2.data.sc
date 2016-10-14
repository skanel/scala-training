/*
	val <name>: <type> = <literal>
	or
	var <name>: <type> = <literal>
*/
val mynum: Int = 5

//I - Values
//val <identifier>[: <type>] = <data>

val x: Int = 20
val greeting: String = "Hello, World"
val atSymbol: Char = '@'
//val atChar:Char = "a"


val intNum: Int = 10
val longNum: Long = intNum
//val intNum2: Int = longNum //error


//Converting Between Numeric Types (Casting)
//int a = (int) 100.00;
/*
val b = a.to[Tab]
toByte     toChar     toDouble   toFloat    toInt      toLong
	toShort    toString
*/
19.45.toInt
val a = 1000L
a.isValidByte
a.isValidShort

//II - Variable

var intNum2 = 5
var intNum3 = intNum2 * 4
//var  intNum3 = "I am not a num"

//However, the object that a val is pointing to is not constant, and may be modified.
 val arr = new Array[Int](2)
arr(0) = 1
arr
//Array[Int] = Array(1, 0)
def z = 1
//z = 2

/*
scala> val a = {println("Hi"); 1}
Hi
a: Int = 1

scala> def b = {println("Hi"); 1}
b: Int

scala> a + 1
res2: Int = 2

scala> b + 1
Hi
res3: Int = 2
*/