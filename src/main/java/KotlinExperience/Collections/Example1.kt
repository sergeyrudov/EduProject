package KotlinExperience.Collections

class Example1 {
}

fun main() {
    val array :Array<Int?> = arrayOf(1, 2, 5, 10, -2, null)
    val array1 :Array<Int?> = arrayOfNulls<Int?>(10)


    println(array[2])
    array[0] = - 100
    println(array[0])
}