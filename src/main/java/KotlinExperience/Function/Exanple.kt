package KotlinExperience.Function

class Exanple {
}


fun main() {
    println(max(5, 10))
    println(crop("test123555"))
    println(sum(3,6,3,9,-1))
}

fun max(a:Int, b:Int)  =
   if (a > b) a else b

fun crop(str:String) = str.substring(0, Math.min(5, str.length))

fun sum(vararg numbers:Int):Int {
    var result = 0
    for (num in numbers) {
        result+=num
    }
    return result
}
