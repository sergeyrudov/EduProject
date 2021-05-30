package KotlinExperience.WithLet

class ModifyString {
}



fun modifyString(string:String, modify:(String) -> String ): String {
        return modify(string)
}


fun main() {
    val result:String = modifyString("Hello world", {it.toUpperCase()})
    println(result)
}