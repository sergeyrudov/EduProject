package KotlinExperience.Collections

class Example7 {
}

fun main() {
    val data:Map<String, List<Int>> = mapOf(
        "January" to listOf(100,100,100,100),
        "February" to listOf(200,200,-190,200),
        "March" to listOf(300,180,300,100),
        "April" to listOf(250,-250,100,300),
        "May" to listOf(200,100,400,300),
        "June" to listOf(200,100,300,300)
    )
    printInfo(data)
}

fun printInfo(data: Map<String, List<Int>>) {
    val validData = data.filterNot { it.value.any{it < 0} }
    val averageWeek = validData.flatMap { it.value }.average()
    println("average value for week: $averageWeek")


    val listOfSum = validData.map { it.value.sum() }
    val max = listOfSum.maxOrNull()
    val min = listOfSum.minOrNull()
    val averageMonth = listOfSum.average()

    val maxMonths = validData.filter { it.value.sum() == max }.keys
    val minMonths = validData.filter { it.value.sum() == min }.keys

    println("average value for month: $averageMonth")
    println("max value for month: $max")
    print("was in months: ")
    for (month in maxMonths) {
        print("$month ")
    }

    println("\nmin value for month: $min")
    print("was in months: ")
    for (month in minMonths) {
        print("$month ")
    }

    val inValidData = data.filter { it.value.any{it < 0} }
    val errorMonth = inValidData.keys
    print("\nerrors was in months: ")
    for (month in errorMonth) {
        print("$month ")
    }
}