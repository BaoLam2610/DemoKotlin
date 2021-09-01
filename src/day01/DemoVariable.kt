package day01

var money: Int = 1_000

fun main(args: Array<String>) {
    // phân biệt val và var
    // biến val : biến k cho thay đổi ( giống như hằng )
    val name: String = "Bao Lam"

    // name = "Hoa" // báo lỗi
    var age: String = "12"
    age = "21" // var như là biến bt, có thể gán lại mọi lúc mọi nơi

    println("$name $age")
//    println(name + " " + age) -> $name $age

    // biến cục bộ -> đặt trong hàm
    // biến toàn cục -> đặt ngoài hàm
    // vd:
//    money = 1_500
//    print(money)

    // biến null
    //var str : String = null  // lỗi do khai báo string k đc = null trong Kotlin
    var str: String? = "Bao Thao" // ok -> thêm dấu ? đằng sau kiểu
    var str1 = "Thao" // ok
    //str1 = null // nhưng khi kb là null thì sai , do biến kb từ đầu là khác null
    println(str)
    println(name)
    // Demo

    var school: String? = null
    println(school)
    school = "Truong THPT Pha Lai"
    println(school)
    // convert string to int
    var number: Int
//    number = "20".toInt()
    number = "20".toIntOrNull()!! // 20
    val a = "11".toIntOrNull()   // 11
    val b = "-11".toIntOrNull()  // -11
    val c = "11.7".toIntOrNull() // null
    val d = "11.0".toIntOrNull() // null
    val e = "abc".toIntOrNull()  // null
    val f = null?.toIntOrNull()  // null

    println(number)
    // int to string
    var s: String?
    s = number.toString()
    println(s)

}

