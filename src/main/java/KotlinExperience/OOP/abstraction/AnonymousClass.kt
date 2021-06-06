package KotlinExperience.OOP.abstraction

class AnonymousClass {
}

fun main() {
    travel(object : Transport("Bus") {
        override fun drive() {
            println("Bus is going")
        }

    })
}


fun travel(transport: Transport) {
    transport.drive()
}