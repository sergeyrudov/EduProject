package KotlinExperience

fun main() {
    val testUser1 = ConstructorExample("John", "Doe", 41)
    val testUser2 = ConstructorExample("Ivan", "Petrov", 36)

    println(testUser1)

}

class ConstructorExample(_firstname:String, _surname:String, _age:Int) {

    var firstname:String
    var surname:String
    var age:Int

    init {
        firstname = _firstname
        surname = _surname
        age = _age
    }

    override fun toString(): String {
        return "ConstructorExample(firstname='$firstname', surname='$surname', age=$age)"
    }
}
