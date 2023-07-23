fun main(){
    println("Make a choice: Pizza or Chicken Or Pancake or Cake")
    var choice = readln()

    when(choice){
        "Pizza" -> print("Pizza Hut")
        "Chicken" -> print("KFC")
        "Pancake" -> print("Food Hub")
        "Cake" -> print("Cakely")
        else -> print("That option doesn't exist")
    }
}