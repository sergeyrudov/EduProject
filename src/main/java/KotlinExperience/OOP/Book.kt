package KotlinExperience.OOP

class Book(val name:String, var year:Int? = null, val price:Int? = null)

fun main() {
    val book = Book("Name")
    println(book.name)
}