package KotlinExperience

class WhenExample {
}

fun main() {
    val time = 23
    val weatherIsGood = true

    val rslt = when {
        time in 6..22 && weatherIsGood -> {
            "Go walk"
        }
        time in 6..22 && !weatherIsGood -> {
            "To read the book"
        }
        else -> {
            "Sleep"
        }
    }
    println(rslt)
}