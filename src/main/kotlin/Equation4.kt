import kotlin.math.sqrt

fun main(){
    //x3 + 7x2 + 10x = 0
    val a = 1
    val b = 7
    val c = 10

    val x1 = b + sqrt((b*b -(4 * a * c)).toDouble())/2*a
    println("Value of X1 is $x1")
    val x2 = b - sqrt((b*b -(4 * a * c)).toDouble())/2*a
    print("Value of X2 is $x2")
}