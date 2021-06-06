package KotlinExperience.OOP.abstraction

abstract class Transport(open val name:String) {
    abstract fun drive()
}

class Car(override var name: String = "Audi"): Transport(name) {
    override fun drive() {
        println("Car is running")
    }

    fun startEngine() : Boolean {
        println("Starting engine...")
        return true
    }

}

class Bicycle: Transport("Sport bicycle") {
    override fun drive() {
        println("Bicycle is running")
    }

}

fun main() {
    val car: Transport = Car()
    //val bicycle:Transport = Bicycle()
    /*if (car is Car) {
        car.name = "BMW"

    }*/
    //if(car !is Car) return
    if (car is Car && car.startEngine())
    println(car.name)
}