package KotlinExperience

class ConsctructorExample3(var name:String = "John", var surname:String = "Doe") {
}

fun main() {
    val user1 = ConsctructorExample3()
    println("${user1.name} ${user1.surname}")

    val user2 = ConsctructorExample3("Masha", "Egorova")
    println("${user2.name} ${user2.surname}")

    val user3 = ConsctructorExample3("Vasiliy")
    println("${user3.name} ${user3.surname}")
}
