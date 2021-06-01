package KotlinExperience.Collections

class Exampl3 {
}

fun main() {
    val names = listOf<String>("Ivan", "Andrey", "Aleksey", "Roman", "Irina")
    val namesStartsFromA = names.filter { it.startsWith("A") }

    for (name in namesStartsFromA) {
        println(name)
    }



    val attribute:String? = ""

    println(attribute.isNullOrEmpty())

    test("sdsdd", "wewfwef")
}

fun test(vararg element:String) {
    for(i in element) {
        println(i)
    }
}