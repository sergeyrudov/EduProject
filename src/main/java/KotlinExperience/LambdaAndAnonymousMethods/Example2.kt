package KotlinExperience.LambdaAndAnonymousMethods

class Example2 {
}

fun main() {
    val perimetr:(Int, Int) -> Int = {a, b -> (a+b) *2}
    println(perimetr(3,9))

    val sayHello:(String) -> Unit = { println("Hello, $it!")}
    sayHello("Igor")

    val sort:(Array<Int>) -> Array<Int> = {
        for (i in it.size -2 downTo 0) {
            for (j in 0..i) {
                if (it[j] < it[j+1]) {
                    val temp = it[j]
                    it[j] = it[j+1]
                    it[j+1] = temp
                }
            }
        }
        it
    }

    val sortedArray = sort(arrayOf(4,9,2,0,-1,22))
    for (i in sortedArray) {
        println(i)
    }
}