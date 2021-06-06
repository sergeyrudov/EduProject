package KotlinExperience.OOP.companionObject

class LateInitExample {
    private lateinit var a:String // first solution  private var a:String? = null or private var a:String = ""

    fun printA() {
        a = "test"
        println(a)
    }
}

fun main() {
    val lateInitExample = LateInitExample()
    lateInitExample.printA()
}