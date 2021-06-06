package KotlinExperience.OOP

data class Student(val name:String, val lastname:String, val id:String) {
    // in data class methods toString(), hashCode(), equal(), copy(), componentN() are overrided
}


fun main() {
    val student1 = Student("Ivan", "Ivanov", "234234")
    val student2 = Student("Ivan", "Ivanov", "234234")
    val student3 = student1.copy(id = "3423")
    val (name, _, id) = student1 // -> destructor or destructive operator
    println(name)

   /* println(student1)
    println(student2)

    println(student1.hashCode())
    println(student2.hashCode())

    println(student1 == student2)
    println(student1 === student2)*/
    println(student1 === student3)
    println(student3.id)


}