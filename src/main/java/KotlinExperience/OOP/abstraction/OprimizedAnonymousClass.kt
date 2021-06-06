package KotlinExperience.OOP.abstraction


interface WaterBoyDelivery {
    fun bringWater()
}

class Strongman {
    fun invokeWaterBoy(waterBoy: WaterBoy) {
        waterBoy.bringWater()
    }

    inline fun invokeWaterBoy(bringWater:() -> Unit) {
        bringWater()
    }
}


fun main() {
    val strongman = Strongman()
    strongman.invokeWaterBoy { println("Water is bringing") }

}









class AnonymousClassExample2 {
}