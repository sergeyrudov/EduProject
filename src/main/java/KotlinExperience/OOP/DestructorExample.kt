package KotlinExperience.OOP

class DestructorExample(val name:String, val lastName:String, val id:String) {
    operator fun component1() = name
    operator fun component2() = lastName
    operator fun component3() = id

}

fun main() {
    val stud1 = DestructorExample("Ivan", "Ivanov", "3442")
    val(name, _, id) = stud1

    println(name)
    println(id)

}