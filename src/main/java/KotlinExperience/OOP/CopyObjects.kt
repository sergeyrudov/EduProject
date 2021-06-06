package KotlinExperience.OOP

class CopyObjects(val name:String, val lastName:String, val id:String) {

    fun copy(name:String = this.name, lastName:String = this.lastName, id:String = this.id): CopyObjects {
        return CopyObjects(name, lastName, id)
    }
}

fun main() {
    val obj = CopyObjects("Vasiliy", "Petrov", "234234")
    val obj1 = obj.copy()
    println(obj1.name)
}