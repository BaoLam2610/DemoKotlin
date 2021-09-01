package day02

fun main() {

    // câu lệnh if - else
    var a = 10
    var b = 20
    var c: Int = 30

    if (a > b) {
        if (a > c)
            println("a la so lon nhat")
        else
            println("c la so lon nhat")
    } else if (a < b) {
        if (b > c)
            println("b la so lon nhat")
        else
            println("c la so lon nhat")
    } else if (a < c) {
        if (c > b)
            println("c la so lon nhat")
        else
            println("b la so lon nhat")
    }

    // switch
    var str = "1"
    when (str) {
        "1" -> println("Xin chao ban Bao Lam <3")
        "2" -> println("Muc dich cua ban la gi?")
    }

    // toán tử 3 ngôi
    a = 10
    b = 20
    var max = when (a > b) {
        true -> a
        false -> b
    }
    println("So lon nhat la $max")
    // ss 3 số
    max = when (a > b) {
        true -> if (a > c) a else c
        else -> if (b > c) b else c
    }
    println("So lon nhat la $max")
}