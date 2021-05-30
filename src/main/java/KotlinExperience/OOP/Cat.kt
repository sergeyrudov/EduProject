package KotlinExperience.OOP

class Cat(val name:String, val age:Int, val weight:Float =0f) {
    val isOld = age > 3
    fun printInfo() {
        println("Name: $name Age: $age Weight: $weight")
    }
    //fun isCatOld() = age > 12
}

fun main() {
    val cat = Cat("Barsik", 5, 3f)
    cat.printInfo()
    println(cat.isOld())

}

// extension method for class Cat
fun Cat.isOld() = age > 12