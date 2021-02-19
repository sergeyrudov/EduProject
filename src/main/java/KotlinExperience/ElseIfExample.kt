package KotlinExperience

class ElseIfExample {
}

fun main() {
    val a:Int = 40

    if (a < 40) {
        println("A less than 40")
    } else if (a < 60) {
        println("A more than 40, but less than 40")
    } else {
        println("A is 60 or more")
    }
}