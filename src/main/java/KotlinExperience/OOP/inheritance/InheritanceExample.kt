@file:JvmName("DogKt")

package KotlinExperience.OOP

class InheritanceExample {
}

open class Animal(val name:String, var weight:Float, val habitat:String) {

    open fun eat() {
        println("I am eating")
    }

    open fun run() {
        println("I am running")
    }
}

class SomeDog(weight: Float) : Animal("Dog", weight, "Terrain") {

    override fun eat() {
        println("I am ear bone")
    }

    override fun run() {
        println("I am running on terrain")
    }
}


fun main() {
    val dog = SomeDog(3f)
    println(dog.run())
}