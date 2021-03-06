package KotlinExperience.WithLet


class LetExample {
}

val names:MutableList<Int>? = mutableListOf()
var nameStr:String? = null
var values = arrayListOf<Int?>(null)
var NPETest:Double? = null

fun main() {

    names?.let {
        println(it)
    }

    nameStr?.let {
        println(it)
    }

    values?.let {
        println(it)
    }

    try {
        println(NPETest!!)
    } catch (ex: NullPointerException) {
        println("$ex error msg")
    }

    NPETest?.let {
        println(it)
    }
}