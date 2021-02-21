package KotlinExperience.Collections

class Example6 {
}

fun main() {
    val initArray = mutableListOf<Int>()
    for (i in 0 until 1000) {
        initArray.add((Math.random() * 1000).toInt())
    }
    val result = initArray.filter { it % 5 == 0 || it % 3 == 0 }.map { it * it }.sortedDescending().map { "$it" }
    for (i in result) {
        println(i)
    }
}