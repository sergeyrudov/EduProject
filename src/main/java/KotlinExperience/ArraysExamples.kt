package KotlinExperience


class ArraysExamples {

}

fun main() {
    val itemsString: Array<String> = arrayOf("Hello", "World", "Korlin")
    val itemsInt: Array<Int> = arrayOf(1, 5, 77, 345, 72, 0, -3)
    val someArray: Array<Int>
    val listItems = listOf<Int>(3, 6, 9, 33, 0, 1)
    val item:Any = 2

    var user: Map<String, Int> = mapOf("ID" to 1, "age" to 22, "ID" to 2, "age" to 955)
    var anytypeDataMap: Map<String, Any> = mapOf("age" to 77, "surname" to "Sidorov", "haveDriveLicence" to false)

    println(itemsString[1])
    println("-----------------------")
    println(itemsString.get(1))
    println("-----------------------")
    println(itemsInt.get(itemsInt.size - 1))
    println("-----------------------")
    println(itemsInt[3])
    println("-----------------------")
    println(listItems.size)
    println(itemsInt.set(1, 222))
    println("-----------------------")
    println(itemsInt.contentToString())
    println("-----------------------")
    println(itemsString.get(0).toUpperCase())
    println("-----------------------")
    println(listItems.lastIndexOf(0))
    println("-----------------------")

    anytypeDataMap.forEach { key, value ->
        println("$key ||| $value")
    }


    /*for(i in itemsInt) {
        println(i)
    }*/

    itemsInt.forEach { i ->
        println(i)
    }

    itemsInt.forEachIndexed { index, element ->
        println("$element with index $index")
    }

    var listWitchMutableData = mutableListOf<Int>(22,0,6,-1,1233)
    listWitchMutableData.add(0, -11)



    println("-----------------------")

    fun printArrayInt(items:Array<Int>) {
        for (item in items) {
            println(items.contentToString())
        }
    }
    println("-----------------------")

    fun printArrayString(items:Array<String>) {
        items.forEach { i ->
            println(i)
        }
    }
    printArrayString(itemsString)
    println("-----------------------")
    printArrayInt(arrayOf(3,5,66))
}

