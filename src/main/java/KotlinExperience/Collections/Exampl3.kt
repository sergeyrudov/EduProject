package KotlinExperience.Collections

class Exampl3 {
}

fun main() {
    val names = listOf<String>("Ivan", "Andrey", "Aleksey", "Roman", "Irina")
    val namesStartsFromA = names.filter { it.startsWith("A") }

    for (name in namesStartsFromA) {
        println(name)
    }
}