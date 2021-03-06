package KotlinExperience.Collections


class ZIPExample1 {
}

fun main() {
    val  fullNames = mutableListOf<String>()
    for (i in 0..1000) {
        fullNames.add("Name$i Surname$i")
    }

    val names = fullNames.map { it.substringBefore(" ") }
    val lastName  = fullNames.map { it.substringAfter(" ") }

    val users = names.zip(lastName)
    /*for (user in users) {
        println("${user.first} ${user.second}")
    }*/



    // second variant

    val  fullNames1 = mutableListOf<String>()
    for (i in 0..1000) {
        fullNames1.add("Name$i Surname$i")
    }

    val users1 = fullNames1.map { Pair( it.substringBefore(" "), it.substringAfter(" ")) }
    for (user in users1) {
        println("${user.first} ${user.second}")
    }




}