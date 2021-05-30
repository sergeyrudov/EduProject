package KotlinExperience.extendFunc

class WithExtendList {
}

fun main() {
    val list = listOf<Int>()
    myWith(list) {
        sum()
        average()
    }

    val str = "hello"
    myWith(str) {
        println(this.toUpperCase())
    }
}

fun myWith(list: List<Int>, operation:List<Int>.() -> Unit) {
    list.operation()
}

fun myWith(string: String, operation:String.() -> Unit) {
    string.operation()
}
