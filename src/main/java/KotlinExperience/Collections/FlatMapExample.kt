package KotlinExperience.Collections

class FlatMapExample {
}

fun main() {
    val revenueByWeek: List<List<Int>> = listOf(
        listOf(8, 5, 6, 1, 2),
        listOf(4, 9, 8, 10, 4),
        listOf(6, 7, 1, 3, 12),
        listOf(1, 3, 2, 4, 7),

    )
    // 1-st variant
    /*val total = mutableListOf<Int>()
    revenueByWeek.map {
        for (i in it) {
            total.add(i)
        }
    }*/

    // 2-nd variant
    val total = revenueByWeek.flatten() // or val total = revenueByWeek.flatMap { it }

    val average = total.average()
    println(average)
}
