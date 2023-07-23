fun main(){
    println("Make a choice: Pizza or Chicken Or Pancake or Cake")
    var choice = readln()
    if (choice == "Pizza"){
        print("Pizza Hut")
    } else if (choice == "Chicken"){
        print("KFC")
    } else if (choice == "Pancake"){
        print("Food hub")
    } else if (choice == "Cake"){
        print("Cakely")
    } else{
        print("That restaurant doesn\'t exist")
    }
}