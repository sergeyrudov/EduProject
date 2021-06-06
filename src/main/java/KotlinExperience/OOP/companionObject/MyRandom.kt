package KotlinExperience.OOP.companionObject

class MyRandom {

    companion object {
        private const val  MONDAY = "Monday"
        private const val  TUESDAY = "Tursday"
        private const val  WEDNESDAY = "Wednesday"
        private const val  THURSDAY = "Thursday"
        private const val  FRIDAY = "Friday"
        private const val  SATURDAY = "Saturday"
        private const val  SUNDAY = "Sunday"

        fun randomInt(from: Int, to:Int) = (Math.random() * (to - from + 1)).toInt() + from
        fun randomBoolean() = randomInt(0, 1) > 0
        fun randomDayOfWeek(): String {
            val index = randomInt(1, 7)
            return when(index) {
                1 -> MONDAY
                2 -> TUESDAY
                3 -> WEDNESDAY
                4 -> THURSDAY
                5 -> FRIDAY
                6 -> SATURDAY
                else -> SUNDAY
            }
        }
    }
}

fun main() {
    println(MyRandom.randomInt(5, 10))
    println(MyRandom.randomBoolean())
    println(MyRandom.randomDayOfWeek())
}