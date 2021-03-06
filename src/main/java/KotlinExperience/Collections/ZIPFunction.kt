package KotlinExperience.Collections

class ZIPFunction {
}

fun main() {
    val names = mutableListOf<String>()
    val phones  = mutableListOf<Long>()

    for (i in 0..1000) {
        names.add("Name$i")
        phones.add(79_000_000_000 + (Math.random() * 1_000_000_000).toLong())
    }

    val users:List<Pair<String, Long>> = names.zip(phones)
    for (user in users) {
        println("User:${user.first} Phone:${user.second}")
    }

}