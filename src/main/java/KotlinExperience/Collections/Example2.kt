package KotlinExperience.Collections

class Example2 {
}

fun main() {
    val listOfNumbers = mutableListOf<Int>()
    for (i in 0..99) {
        listOfNumbers.add(i)
    }

    val listOfEvenNumbers = listOfNumbers.filter { it % 2 == 0  }
    for (i in listOfEvenNumbers) {
        println(i)
    }
}