package KotlinExperience.Loop

class Example6 {
}

fun main() {
    val array = generateSequence(0) {
        it+1}
        .map { "Сотрудник№$it" }

    val firstEmployees = array.take(100)

    for (employee in firstEmployees) {
        println(employee)
    }
}