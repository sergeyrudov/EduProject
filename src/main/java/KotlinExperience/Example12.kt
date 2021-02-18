package KotlinExperience

class Example12 {
}

private var surname:String? = null

fun main() {
    val name = "Ivan"
    val lastName = "Ivanov";
    val fullname = name + " " + lastName
    println(fullname)

    val itemsString: Array<String> = arrayOf("Hello", "World", "Korlin")
    val itemsString1: Array<String> = arrayOf()

    //checkThatInputIsNotNULL(itemsString1)
    checkThatInputIsNotNULL(surname)

    val length = name?.length?:0
    println(name?.length)




}
// adding ? is equal to null check


fun checkThatInputIsNotNULL(surname: String?) {
    println(KotlinExperience.surname?.length)
}