package KotlinExperience.DefaultParameters

class Example1 {
}


fun main() {
    //printInfo("Pupkin", "Vasiliy")
    printInfo(name = "Vasiliy", lastName = "Ivanov")
}

fun printInfo(lastName:String, name:String, patronomic:String) {
    println("lastname is $lastName")
    println("name is $name")
    if (!patronomic.isEmpty()) {
        println("patronomic is : $patronomic")
    }
}
fun printInfo(lastName:String, name:String) {
    printInfo(lastName, name, "")
}
fun printInfo(lastName: String, age:Int = 10) {
    println("Lastname is: $lastName and age is $age")
}