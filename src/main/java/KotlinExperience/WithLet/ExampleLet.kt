package KotlinExperience.WithLet

class ExampleLet {
}

var name:String? = null // друстим это драйвер, он может быть нулл

fun main() {

    name?.let {
        if (it.length > 5) {  // это решение позволяет избежать !!, и проверок на нул. В случае если драйвер вернет null то ошибки НПЕ не будет
            println("Test")
        }
    }

    println(name!!.length > 5) //  классический способ для тех кто перешел с джавы, оператор!! который утверждает что не нулл, компилятор пропускает, но если там все таки нулл то будет НПЕ





    /*if (name?.length?.compareTo(5) == 1) {
        println("Test")
    }*/
}