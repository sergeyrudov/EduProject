package KotlinExperience.OOP.inheritance

open class Worker(val name:String, val age:Int) {

    open fun work() {
        println("I am working")
    }
}

class Programmer(name: String, age: Int, val language:String) : Worker(name, age) {
    override fun work() {
        println("I am writing code on $language")
    }
}

fun main() {
    val workers = mutableListOf<Worker>()
    workers.add(Worker("Leonid", 27))
    workers.add(Worker("Ivan", 30))
    workers.add(Worker("Mihail", 23))
    workers.add(Programmer("Stepan", 31, "Java"))
    workers.add(Programmer("John", 19, "Kotlin"))

    for (worker in workers) {
        worker.work()
    }



}