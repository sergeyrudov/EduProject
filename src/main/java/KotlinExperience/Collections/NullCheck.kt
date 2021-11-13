package KotlinExperience.Collections

class NullCheck {


    fun getVal(): String? {
        return "hello"
    }

}

fun main() {
    fun getVal(): String? {
        val a = null
        return a
    }


    println(getVal()!!.length)
}