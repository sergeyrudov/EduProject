package KotlinExperience


class TestArrayStream {
}

fun main() {
    val array = mutableListOf<String>("Hello", "World", "Kotlin", "How", "Are", "You", "Doing?")
    test(array, "Are")


}


fun test(value: List<String>, string: String){
    if (value.any() { it == string })
        println("OK")


}


