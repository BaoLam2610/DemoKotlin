package day02

const val LAST_NAME = "Nguyen Bao Lam"

fun main() {
    // Kiểu số
    var n1: Int
    var n2: Long
    var n3: Float
    var n4: Double

    // Chuỗi
    var s1: String?
    var s2: Char?

    s1 = "Hello World"
    s2 = 'L'

    // Boolean
    var b1: Boolean = true
    var b2: Boolean = false

    // biến: var
    // hằng: val

    // khai báo k xác định trước
    /*val i = "2"
    println(i)*/

    // Convert int to string
    var str: String?
    var i = 23
    str = i.toString()
    println(str) // str = "23"

    // Convert string to int
    str = "26"
    var a: Int = str.toInt()// toLong()
    println(a)  // a = 26

    str = "3.6" // 3.6f
    var b: Float = str.toFloat()// toDouble()
    println(b)

    /*val a = "11".toIntOrNull()   // 11
    val b = "-11".toIntOrNull()  // -11
    val c = "11.7".toIntOrNull() // null
    val d = "11.0".toIntOrNull() // null
    val e = "abc".toIntOrNull()  // null
    val f = null?.toIntOrNull()  // null*/
}

