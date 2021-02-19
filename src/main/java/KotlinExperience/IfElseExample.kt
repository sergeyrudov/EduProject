package KotlinExperience

class IfElseExample {
}
// Any(Kotlin) == Object(Java)
fun main() {
    var count = 200
    val car: Any? =
        if (count > 500) {
            count -= 500
            println("You can buy BMW")
            "BMW"
        } else if (count > 300) {
            count -= 300
            println("Yo can buy Toyota")
            220
        } else {
            count-=30
            println("You can buy Lada")
            null
        }
    println("Car that you can buy is: $car, and amount is $count")
}