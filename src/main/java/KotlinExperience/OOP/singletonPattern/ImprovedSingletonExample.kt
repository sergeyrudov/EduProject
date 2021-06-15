package KotlinExperience.OOP.singletonPattern

object ImprovedSingletonExample {
    val name = "main.db"
    val version = "1"
    val data = mutableListOf<String>()

    fun insertData(str: String) {
        data.add(str)
    }
}


fun main() {
    val dataBase = ImprovedSingletonExample
    dataBase.insertData("Hello")
    dataBase.insertData("World")
    dataBase.insertData("I am Kotlin")
    dataBase.insertData("singleton pattern example")

    for (data in dataBase.data) {
        println(data)
    }
}