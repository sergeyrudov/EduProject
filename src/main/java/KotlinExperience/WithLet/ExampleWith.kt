package KotlinExperience.WithLet

class ExampleWith {
}

fun main() {
    val list = mutableListOf<Int>()

    with(list) {
        for (i in 0 until 1000) {
            this.add((Math.random() * 100).toInt())
        }

        println(sum())
        println(average())
        println(minOrNull())
        println(maxOrNull())
        println(first())
        println(last())
    }

}