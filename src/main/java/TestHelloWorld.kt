fun main() {
    println("Hello world")
    check()
    check("PRIVET")
    count(2)


    val cats = arrayListOf<String>()
    cats.add("Cat 1")
    cats.add("Cat 2")
    cats.add("Cat 3")

    for(cat in cats){
        println("Cat name is: $cat")
    }


    val dogs = listOf<Int>()

    val map = mapOf(Pair(Int, String))

    val name:String = "2344"
    val age:Int

    println("KK $name")

    val cats1 = arrayListOf("Barsik", "Murzik", "Vaska")
    for( (index, element) in cats1.withIndex()){
        println("$index: $element")
    }

    for(i in 10 downTo 1 step 2){
        print("$i ")
    }

    for(i in 10 downTo 1){
        print("$i ")
    }
    for (letter in 'A' until  'Z') print(letter)
}


fun check() {
    println("Function was called")
}



fun check(t:String) {
    println(t.toLowerCase())
}


fun count(s: Int) {
    for (Int in s.until(3)) {
        println(s)
    }

    for(i in 1..5){
        println(i)
    }
}




