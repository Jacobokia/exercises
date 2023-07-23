import kotlin.math.sqrt

fun main(){
   //x2 + 10x + 25 = 0

    val a = 1
    val b = 10
    val c = 25

    val y1 = b + sqrt((b*b -(4 * a * c)).toDouble()) /2*a
    println("Value of y1 is $y1")
    val y2 = b - sqrt((b*b -(4 * a * c)).toDouble()) /2*a
    print("Value of y2 is $y2")
}