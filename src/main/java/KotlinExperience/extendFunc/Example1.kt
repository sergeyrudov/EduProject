package KotlinExperience.extendFunc

class Example1 {
}

fun main() {
    val age = 5
    if(age.isAgeValid()) {
        println("Valid")
    }
    if(age.isAgeValid()) {
        println("Valid too")
    }
    if(age.isAgeValid()) {
        println("Valid too2")
    }

    println(age.isPositive())

    val name = ""
    if (!name.isEmpty()) {
        println("message")
    }
    println(28.isPrime())
}

//fun isAgeValid(age: Int) = age in 6..100

fun Int.isAgeValid() = this in 6..100
fun Int.isPositive() = this >=0

fun Int.isPrime() : Boolean {
    if (this <= 3) return true
    for (i in 2 until this) {
        if (this % i == 0) return false
    }
    return true
}

// method isNotEmpty is extension function