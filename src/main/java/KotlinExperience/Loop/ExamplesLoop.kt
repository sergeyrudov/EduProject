package KotlinExperience.Loop

class ExamplesLoop {
}

fun main() {
    val array = arrayOfNulls<Int?>(101)

    /*for (i in array.indices) {
        array[i] = i
    }

    for (i in array) {
        println(i)
    }*/

    for (i in 10 downTo 0) {
        println(i)
    }
    for (i in 100 downTo 0 step 10) {
        println("value is : $i")
    }
}