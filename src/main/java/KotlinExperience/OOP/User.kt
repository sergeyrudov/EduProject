package KotlinExperience.OOP

class User {
    var age:Int = 0
    set(value) {
        if (value >=0) {
            field = value
        }
    }

    var name:String? = null
    get() {
        return if (field == null) {
            ""
        } else {
            field
        }
    }



}
fun main() {
    val user = User()
    user.age = 10
    user.name = "Jimny"
    println("${user.name} and ${user.age}")


}