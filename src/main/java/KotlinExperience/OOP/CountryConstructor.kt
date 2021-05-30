package KotlinExperience.OOP

class CountryConstructor(var name: String , var population: Long) {

    // secondary constructor, as default value
    constructor() : this("", 0)

}

fun main() {
    val usa = ConstructorExample("USA", 250_000_000)
    println(usa.name)
    println(usa.population)
}