package KotlinExperience.WithLet

class ModifyList {
}



inline fun listModify(list: List<Int>, operator:(List<Int>) -> Unit) {
    operator(list)
}

fun main() {
    val list:List<Int> = (0..100).toList()
    listModify(list) {
        println(it.sum())
    }

}