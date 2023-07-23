fun main(){

   var speed = 20
    val route1 = 5000
    val route2 = 25000
    val route3 = 50000
    val another = 10000


    println("Enter the distance of the route to find time it takes:")
   var distance = readln().toInt()
    println("Enter the speed of the route to find time it takes:")
    speed = readln().toInt()

    if (distance == 5000){
        var time = route1/speed
        print("The time for route 1 is $time")
    } else if(distance == 25000){
        var time = route2/speed
        print("The time for route 2 is $time")
    } else if (distance == 50000){
        var time = route3/speed
        print("The time for route 3 is $time")
    } else if (distance == 10000){
        var time = another/speed
        print("The time for route another is $time")
    } else{
        print("Distance not captured")
    }

}