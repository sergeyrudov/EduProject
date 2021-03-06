package KotlinExperience

class Modifiers {
}

fun main() {
    val mouse = Mouse()
        // mouse.voiceM() error


}

open class Mouse {
    protected fun voiceM() {
        println("Test")
    }
}

class Cat : Mouse() {
    fun voiceC() {
        println("Test cat")
        voiceM()
     }
}

