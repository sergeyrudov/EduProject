package KotlinExperience

fun main() {
    val user1 = User()
    println(user1.printUser())


}

class User{
    val firstname:String = "Ivan"
    val surname:String = "Petrov"


    fun printUser() {
        println("$firstname $surname")
    }



}

