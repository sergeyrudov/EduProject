package KotlinExperience.Collections

import java.util.*

class Example1 {
}

fun main() {
    val array :Array<Int?> = arrayOf(1, 2, 5, 10, -2, null)
    //val array1 :Array<Int?> = arrayOfNulls<Int?>(10)


    println(array[2])
    array[0] = - 100
    println(array[0])

    val tt = mutableListOf<UUID>(UUID.randomUUID(), UUID.randomUUID())

    tt.forEach { println(it) }
}