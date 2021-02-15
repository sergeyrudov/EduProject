package KotlinExperience

class Constructor4(var name:String, var surname:String) {
    var age:Int? = null


    set(value) {
        if (value != null && value >=18) {
            field = value
        } else if (value != null) {
            if (value <=0) {
                field = null
                println("Incorrect age")
            }
        }
    }

    private val driveLicense:Boolean

    get() {
        return true
    }

    override fun toString(): String {
        return "Constructor4(name='$name', surname='$surname', age=$age, driveLicense=$driveLicense)"
    }
}

fun main() {
    val user = Constructor4("Igor", "Petrov")
    user.age = 20
    println(user)
}
