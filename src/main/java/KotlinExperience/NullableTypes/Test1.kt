package KotlinExperience.NullableTypes

class Test1 {
}

private var name:String? = "sfwferg"

fun main() {
    val length = name?.length?:0
    println(length)
}