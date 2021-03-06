package KotlinExperience


enum class Car(private val type: String) {

    SPORT("sport car"),
    SEDAN("sedan car"),
    DRAGSTER("dragster car"),
    NASCAR("nascar car");

    override fun toString(): String {
        return "Car(type='$type')"
    }

}

class CarLambda(var vendor: String, var Car: Car, var power: Int, var isFullAWD: Boolean, var price: Int) {

    override fun toString(): String {
        return "CarLambda(vendor='$vendor', Car=$Car, power=$power, isFullAWD=$isFullAWD, price=$price)"
    }

    companion object {
        fun status() {
            println("Companion object called")
        }
    }
}


fun main() {
    val car1 = CarLambda("BMW", Car.SPORT, 330, true, 55000)
    val car2 = CarLambda("Audi", Car.DRAGSTER, 1330, false, 135000)
    val car3 = CarLambda("Honda", Car.SEDAN, 230, true, 33000)
    val car4 = CarLambda("Nissan", Car.NASCAR, 330, false, 35000)
    val car5 = CarLambda("Fiat", Car.SEDAN, 130, true, 19000)

    val carsArray: ArrayList<CarLambda> = ArrayList<CarLambda>()
    carsArray.add(car1)
    carsArray.add(car2)
    carsArray.add(car3)
    carsArray.add(car4)
    carsArray.add(car5)

    CarLambda.status()

    // print all cars
    carsArray.stream().forEach() {
        //println(it)
    }

    // show car where power more than 200
    carsArray.stream().forEach {
        if (it.power > 200) {
            println(it.vendor)
        }
    }

    carsArray.stream().forEach {
        if (it.Car.name.toLowerCase()!=("sport")) {
            println(it.vendor)
        }
    }
}




