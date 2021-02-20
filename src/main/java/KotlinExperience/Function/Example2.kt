package KotlinExperience.Function

class Example2 {

}

fun main() {
    val numbers1 = mutableListOf(5, 8, 12, -1, 200,50 ,3, 9,5,0,-21)
    val numbers2 = arrayOf(5, 8, 12, -1, 200,50 ,3, 9,5,0,-21)

    val result = sort(numbers2)
    for (i in result) {
        println(i)
    }
}

fun sort(numbers:MutableList<Int>) : List<Int> {
    for (i in 1 until numbers.size) {
        for (j in numbers.size -1 downTo i) {
            if (numbers[j] < numbers[j-1]) {
                val temp = numbers[j]
                numbers[j] = numbers[j-1]
                numbers[j-1] = temp
            }
        }
    }
    return numbers
}

fun sort(numbers: Array<Int>) = sort(numbers.toMutableList())
fun sort(vararg numbers: Int) = sort(numbers.toMutableList())