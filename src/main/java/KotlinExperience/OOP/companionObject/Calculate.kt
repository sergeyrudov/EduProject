package KotlinExperience.OOP.companionObject

class Calculate {

    val a = 10

    companion object {
        const val PI = 3.14
        fun square(num:Int) = num * num // + a is error
        fun lenghtOfCircle(radius:Float) = 2*3.14 *radius
    }
}

fun main() {
    println(Calculate.square(5))
}