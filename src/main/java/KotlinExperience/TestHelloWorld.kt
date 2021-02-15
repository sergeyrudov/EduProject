package KotlinExperience

val hello = "TEST"

class InitOrderDemo(name: String) {
    val firstProperty = "Первое свойство: $name".also(::println)
    val secondProperty = "Второе свойство: ${name.length}".also(::println)

}

fun main() {
    println("Hello World")

    InitOrderDemo("Test")

    val name = "vasya"
    val surname = "pupkin"
    val index: Float = 4.5f
    val number: Double = 4.65643526457
    var isTrue: Boolean = true
    val charValue: Char = '3'
    println(hello.trim())

    val age = 44
    val salary: Int = 120

    println("Имя: $name и фамилия $surname имеет возраст $age с зарплатой $salary")


    if(age > 50) {
        println("$name is older than 50 years")
    } else if( age < 10) {
        println("$name is younger than 10")
    } else {
        println("$age is not in diapason")
        isTrue=false
        println(isTrue)
    }

    val svv:String
    svv = "33"

    val nullV:String? = null
    println(nullV)

    val car:String?= null

    val number1 = 5;

    // switch case analog from java
    when(number1) {
        null -> print("var is null")
        10 -> print("var is 10")
        190 -> print("var is 190")
        1 -> println("var is 1")
        5 -> println("var is 5")
        else -> println("undefined var")
    }

    val res = if (number1 > 2) 1 else 0
    println("res value is $res")

    val words = when(number1) {
        null -> "Nothing"
        else -> number1
    }

    val stroka:String = "Hello world!"
    val cifra:Int = 1233;
    val cifra2:Int = 234;

    printSomeValue(stroka, cifra)
    println(summValues(cifra, cifra2))
    val res1 = summValues(cifra, cifra2)
    println(saySmth(true))

}

fun printSomeValue(first:String, number: Int):Unit {
    println("$first - $number")
    println(summValues(1, 5))
}

fun summValues(first: Int, second:Int): Int {
    return first + second
}
fun saySmth(first: Boolean) :String = "Hello $first"


