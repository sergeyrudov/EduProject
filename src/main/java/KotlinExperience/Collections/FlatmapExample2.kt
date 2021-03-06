package KotlinExperience.Collections

class FlatmapExample2 {
}

fun main() {
    val data = mapOf<String, List<Int>>(
        "file1" to listOf(1,2,3,4,5,6,7),
        "file2" to listOf(8,9,-10,11,12,13,14),
        "file3" to listOf(15,16,17,18,19,20,21)
    )
    // OR
    val data1 = mapOf(
        Pair("file1", listOf(1,2,3,4,5,6,7)),
        Pair("file2", listOf(8,9,10,11,12,13,14)),
        Pair("file3", listOf(15,16,17,18,19,20,21))
    )

    val average = data.flatMap { it.value }.average() // flatMap -> will return all values into array List<Int>, map -> will return list of arrays, such as List<List<Int>>
    println(average)

    val averageWithoutNegativeValue = data.filter { it.value.all { it >= 0 } }.flatMap { it.value }
    println(averageWithoutNegativeValue) // value of "file2" key excluded from result

    val averageWithoutNegativeValue1 = data.filter { it.value.any { it < 0 } }.flatMap { it.value }
    println(averageWithoutNegativeValue1) // will return result which was exluded, according to rules







}



/*
// for mutable map variant 1
data.put("file1", listOf(1,2,3,4,5,6,7))
data.put("file2", listOf(8,9,10,11,12,13,14))
data.put("file3", listOf(15,16,17,18,19,20,21))

// for mutable map variant 2
data["file1"] = listOf(1,2,3,4,5,6,7)
data["file2"] = listOf(8,9,10,11,12,13,14)
data["file3"] = listOf(15,16,17,18,19,20,21)
*/
