package KotlinExperience.Exceptions

import java.lang.Exception

class Example1 {
}

fun main() {
    println(sum("10", "2kmkm"))
}

fun sum(a:String, b:String): Int {
    /*try {
        val numA = a.toInt()
        val numB = b.toInt()
        return numA + numB
    } catch (e:Exception) {
        return 0
    }*/

    return try {
        val numA = a.toInt()
        val numB = b.toInt()
        numA + numB
    } catch (e:Exception) {
        0
    }

}