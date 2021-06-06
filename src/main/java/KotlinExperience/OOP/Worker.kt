package KotlinExperience.OOP

import java.util.*

class Worker(val name:String, val position:String, val startYear:Int) {
    val experience:Int
    get() = Calendar.getInstance().get(Calendar.YEAR) - startYear

    fun work() {
        println("Working")
    }
}

fun main() {
    val programmer = Worker("Ivan", "programmer", 2016);
    programmer.printInfo()
}

fun Worker.printInfo() {
    println("Name: $name Position: $position Startyear: $startYear Experience: $experience")
}