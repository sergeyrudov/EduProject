package KotlinExperience.LambdaAndAnonymousMethods

class Example1 {
}

fun main() {
    val sum:(Int, Int) -> Int = { a:Int, b:Int ->
        a+b
    }
    println(sum(2,10))

    val square:(Int) -> Int = {
        it * it
    }

    println(square(4))
}