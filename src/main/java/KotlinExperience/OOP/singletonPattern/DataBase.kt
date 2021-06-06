package KotlinExperience.OOP.singletonPattern

class ImprovedDBExample private constructor(){
    val name = "main.db"
    val version = "1"
    val data = mutableListOf<String>()

    fun intsertData(str: String) {
        data.add(str)
    }
    companion object {
        var db : ImprovedDBExample? = null
        fun getInstance(): ImprovedDBExample {
            db?.let {
                return it
            }
            val instance = ImprovedDBExample()
            db = instance
            return instance
        }
    }
}

class Test {
    fun insertTestData(string: String) {
        ImprovedDBExample.getInstance().intsertData(string)
    }
}

fun main() {
    val db = ImprovedDBExample.getInstance()
    db.intsertData("Hello")
    db.intsertData("World")

    val test = Test()
    test.insertTestData("Kotlin")
    test.insertTestData("!")


    for(str in db.data) {
        println(str)
    }
}