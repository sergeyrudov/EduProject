package KotlinExperience.Loop

class Example5 {
}

fun main() {
    val array = (0..1000).toList()
    val employee = array.map{ "Employee # $it"}

    val first30 = employee.takeLast(30)
    for (i in first30) {
        println(i)
    }
}