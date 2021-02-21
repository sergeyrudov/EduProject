package KotlinExperience.Collections

class Example5 {
}

fun main() {
    val array = arrayOf(8,9,0,34,-5,1,-22)
    val sortedArray = array.sortedArray()
    for (i in sortedArray) {
        println(i)
    }
}