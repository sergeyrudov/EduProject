package KotlinExperience.OOP

class DogExample(val name:String, var age:Int, val weight:Float = 0f) {

    val isOld:Boolean
    get() = age >=12

    fun printInfo() {
        println("Name is $name Age is: $age Weight is $weight")
    }
}

fun main() {
    val dog = DogExample("Barsik", 12, 3f)
    println(dog.isOld)
    dog.age = 10
    println(dog.isOld)
    dog.printInfo()
}