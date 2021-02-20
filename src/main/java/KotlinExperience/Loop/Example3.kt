package KotlinExperience.Loop

class Example3 {
}

fun main() {
    val array = arrayOfNulls<Int?>(301)
    // filling array
    for (i in 200..300) {
        array[i] = i
    }
    //  multiply every value X2
    for ((index, i)  in array.withIndex()) {
        array[index] = i?.times(2)
    }
    // read values from array
    for (i in array) {
        println(i)
    }
}