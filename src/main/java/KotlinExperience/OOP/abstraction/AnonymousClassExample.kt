package KotlinExperience.OOP.abstraction


interface WaterBoy {
    fun bringWater()
}

class Sportsman {
    fun invokeWaterBoy(waterBoy: WaterBoy) {
        waterBoy.bringWater()
    }
}


fun main() {
    val sportsman = Sportsman()
    sportsman.invokeWaterBoy(object :WaterBoy {
        override fun bringWater() {
            println("Water is delivered!")
        }
    })
}



class AnonymousClassExample {
}