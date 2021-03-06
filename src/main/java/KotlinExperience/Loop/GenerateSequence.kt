package KotlinExperience.Loop

class GenerateSequence {
}

// start from (0) till function {it+2}
// "lazy initiation" - generation work only if other method request it
fun main() {
    val array = generateSequence (0) {it+2}
    val evenList = array.take(10)

    for (i in evenList) {
        println(i)
    }

    val array1 = generateSequence ('A') {
        println("Generated: ${it + 1}")
    it +2
    }

    val evenList1 = array1.take(10)

    for (i1 in evenList1) {
        println(i1)
    }

    // random 10 int
    val array2 = generateSequence {
        (Math.random() * 100).toInt()
    }

    val evenList2 = array2.take(10)

    for (i2 in evenList2) {
        println(i2)
    }
}


