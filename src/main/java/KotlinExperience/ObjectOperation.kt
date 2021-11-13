


data class ObjectOperation(
    val name: String,
    val age: Int
    )

data class Person(val age: Int) {
    var name: String = "some student"
    var ageSt: Int = age
}


fun main() {
    val st1 = ObjectOperation("First", 29)
    val st2 = ObjectOperation("Second",21)

    val st3 = st1
    println(st3.age)

}



