package KotlinExperience.Collections

class Example4 {
}

fun main() {
    val numbers = (0..100).toList()
    val employees = numbers.map { "Employee #$it" }
    for (employee in employees) {
        println(employee)
    }
}