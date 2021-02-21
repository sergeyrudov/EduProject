package KotlinExperience.Collections

class Example3 {
}

fun main() {
    val numbers = (0..100).toList()
    val doubledNumbers = numbers.map { numbers:Int -> numbers *2 } // { it *2 }

    for (i in doubledNumbers) {
        println(i)
    }
}