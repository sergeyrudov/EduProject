package KotlinExperience.Collections

import java.lang.Exception

class Test {
}

fun main() {


    test()
    }


fun test() {
    val v = "rhrth"
    if(v.isBlank()) {
        println("not blank")
    } else {
        println("blank")
        throw Exception("HELLo")

    }
}



