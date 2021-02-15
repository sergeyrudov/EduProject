package KotlinExperience

class ConstructorExample2(var name:String, var age:Int) {

    constructor(): this ("Peter", 35){
        println("Data was created")
    }

    constructor(name: String): this (name, 48){
        println("Data was added")
    }
}


fun main() {
    val user = ConstructorExample2("Egor",  41)
    val user1 = ConstructorExample2()
    val user2 = ConstructorExample2(name = "Fedor")

    println("${user.age} ${user.name}")
    println("${user1.age} ${user1.name}")
    println("${user2.age} ${user2.name}")
}

