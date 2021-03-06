package KotlinExperience.WithLet

class ExampleLet {
}

var name:String? = null

fun main() {

    name?.let {
        if (it.length > 5) {
            println("Test")
        }
    }

    /*if (name?.length?.compareTo(5) == 1) {
        println("Test")
    }*/
}