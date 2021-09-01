package day02

// Hàm trả về sẽ có dạng:  fun <tên hàm>(tham số): <kiểu dữ liệu>
//fun getName():String{
//    return "Bao Lam"
//}
// hoặc có thể viết tắt
fun getName(): String = "Bao Lam"

//fun getAge():Unit{
//    return 2
//}

// Hàm k trả về
fun showName(){
    println("Xin chao Bao Lam")
}

//fun sayHello(str: String){
//    println("Hello $str")
//}

fun sayHello(str: String) = println("Hello $str")

fun addNumber(int : Int){

}

fun main() {
    var i = 10
    showName()
    println(getName())
    sayHello("Lam")
}