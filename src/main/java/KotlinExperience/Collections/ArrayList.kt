package KotlinExperience.Collections

// recommended to use abstraction, such as MutableList, instead of realization ArrayList
// Interfaces: Set, List, Map is immutable ( you can use getter)
// MutableList, MuttableSet, MuttableMap is mutable data type
// arrayOf - > is fast initialization, immutable collection
fun main() {
    val listOfNumber = ArrayList<Int>()

    listOfNumber.add(5)
    println(listOfNumber[0])


    val array2 : ArrayList<Int> = ArrayList<Int>(10)

    array2.add(15)
    println(array2[0])
    method(array2)

    val array3 : MutableList<String> = mutableListOf<String>("Hello", "World", "Kotlin")
    array3.add(1, "Privet")
    array3[0] = "Some value"
    array3.removeAt(0)
    println(array3)

    val array4 : MutableList<Int> = ArrayList()
    array4.add(8)
    array4[0] = 1
    //array4.removeAt(0)
    println(array4)
}

fun method(list: MutableList<Int>) {
    println(list.add(0, 10))
}