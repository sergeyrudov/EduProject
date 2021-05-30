package KotlinExperience.OOP

class ConstructorExample {

    // can be converted to primary constructor
    var name: String
    var population: Long

    constructor(name:String, population:Long) {
        this.name = name
        this.population = population
    }
}