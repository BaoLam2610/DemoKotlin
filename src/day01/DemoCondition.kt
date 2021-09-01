package day01

fun main() {
    var a = 0
    var b = 1
    // 1. if - else
    if (a > b)
        print("a > b")
    else
        print("a < b")



    println()
    // 2. when = switch trong java, c++, c# ,...
    /*var str : String? = "Bao lam"
    when(str){
        null -> println("Chua co du lieu")
        else -> println("Hello $str")
    }
    var choose = 34
    when(choose){
        0 -> println("Ban la giam doc")
        1 -> println("Ban la truong phong")
        2 -> println("Ban la sinh vien")
        else -> println("Ban la phu ho")
    }*/

    // 3. toán tử 3 ngôi
    val max = when (a > b) {
        true -> a
        false -> b
    }

    var min = if (a > b) b else a
    //    check null
    var str = null
    var check = str ?: "check = null"
    print(check)


}