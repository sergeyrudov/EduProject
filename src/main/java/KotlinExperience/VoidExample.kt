package KotlinExperience

class VoidExample {

}
// Unit(Kotlin) == Void(Java)
fun main() {


    var count = 700
    val car: Unit =
        if (count > 500) {
            count -= 500
            println("You can buy BMW")
        } else if (count > 300) {
            count -= 300
            println("Yo can buy Toyota")
        } else {
            count-=30
            println("You can buy Lada")
        }
    println(car)
}

