package KotlinExperience

class ConstructorExample1(_car:String, _color:String, _power:Int) {
    var car = _car
    var color = _color
    var power = _power
}

fun main() {
    val bmw = ConstructorExample1("BMW", "black", 400)

    println(bmw.color)
}
