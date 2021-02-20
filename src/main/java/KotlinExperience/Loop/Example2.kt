package KotlinExperience.Loop

class Example2 {
}

fun main() {
    val array = arrayOfNulls<Int?>(100)
    // filling array
    for (i in array.indices) {
        array[i] = i
    }
    //  multiply every value X2
    for ((index:Int, i:Int?) in array.withIndex()) {
        array[index] = i?.times(2)
    }
    // read values from array
    for (i in array) {
        println(i)
    }
}