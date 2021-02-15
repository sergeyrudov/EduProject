package KotlinExperience

class FunctionExamples {

}


fun main() {
    printSome("Hello", "World", "Kotlin")
    val names: Array<String> = arrayOf("Hello", "World", "Kotlin", "How", "Do", "You", "Do", "?", "!")
    val data:Array<Int> = arrayOf(1,6,3,9,6767,345,33,0,4,-200,5,7,8,0)
    printForItems(names)
    printForItemsDown(data)
    printAtoZ()
    print("----------")
    printZtoADown()
    println(ifWith(5))

}

fun printSome(vararg word:String) {
    word.forEach { i ->
        print("$i ")
    }
    println()
    printValuesWhile(55)
    printValuesDoWhile(-22)
}

fun printValuesWhile(id:Int) {
    while (id > 0) {
        println("$id is correct")
        return
    }
}

fun printValuesDoWhile(id:Int) {
    do {
        println("Id of user: $id")
    } while (id >=0)
}
fun printForItems(nms:Array<String>) {
    for (i in 0..nms.size-1 step 2)
        println(nms.get(i))
}

fun printForItemsDown(id:Array<Int>) {
    for (i in id.lastIndex downTo 0 step 1)
        println(id.get(i))
}

fun printAtoZ() {
    for (i in 'a'..'z' step 4) {
        print(i)
    }
}

fun printZtoADown() {
    for (i in 'z' downTo 'a' step 2) {
        print(i)
    }
}
fun ifWith(value:Int) {
    if (value !in 10..20) {
        println("$value is not in diapason between 10 and 20")
    }
}
