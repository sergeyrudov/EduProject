package KotlinExperience

class WhenExample2 {
}
// the same case
fun main() {

    // case 1
    val temp1 = 80

    val state1 = if (temp1 < 0) {
        "Твердое"
    } else if (temp1 < 100) {
        "Жидкое"
    } else {
        "Газообразное"
    }
    println(state1)


    // case 2
    val temp2 = 80

    val state2 = when {
        temp2 < 0 -> { "Твердое" }
        temp2 < 100 -> { "Жидкое" }
        else -> { "Газообразное" }
    }
    println(state2)

    val temp3 = 80

    val state3 = when {
        temp3 < 0 -> { "Твердое" }
        temp3 in 0..100 -> { "Жидкое" }
        else -> { "Газообразное" }
    }
    println(state3)

}