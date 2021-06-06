package KotlinExperience.OOP

class KotlinEnumeration {
}


fun main() {
    val month = "June"
    val season:String = when(month) {
        "December", "January", "February" -> "Winter"
        "March", "April", "May" -> "Spring"
        "June", "July", "August" -> "Summer"
        "September", "October", "November" -> "Autumn"
        else -> "Not found"
    }
    println(season)
}