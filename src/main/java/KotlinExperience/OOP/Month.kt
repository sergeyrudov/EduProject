package KotlinExperience.OOP

enum class Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER
}


fun main() {
    val month:Month = Month.APRIL
    val season:String = when(month) {
        Month.DECEMBER, Month.JANUARY, Month.FEBRUARY -> "Winter"
        Month.MARCH, Month.APRIL, Month.MAY -> "Spring"
        Month.JUNE, Month.JULY, Month.AUGUST -> "Summer"
        Month.SEPTEMBER, Month.OCTOBER, Month.NOVEMBER -> "Autumn"
        else -> "Not found"
    }
    println(season)
}