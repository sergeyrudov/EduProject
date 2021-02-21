package KotlinExperience.DefaultParameters

class Exercise2 {
}

fun main() {
    println(volume(10,20, 30))
}

fun volume(a:Int, b:Int = a, c:Int = a) = a * b * c