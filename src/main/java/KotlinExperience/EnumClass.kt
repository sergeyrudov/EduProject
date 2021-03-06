package KotlinExperience


enum class EnumClass(private val firstvalue: String, private val seconValue: String) {

            DATA("data", "Data"),
            VALUES("value", "VALUES"),
            TEST("Test", "test"),
            KOTLIN("Kotlin", "KOTlin");

    override fun toString(): String {

        val vendor1 = "first"
        val vendor2 = "second"
        val factory = "first"


        return if(vendor1 != factory) {
            firstvalue
        } else {
            seconValue
        }
    }
}


fun main() {
    println(EnumClass.DATA)
    println(EnumClass.VALUES)
    println(EnumClass.TEST)
    println(EnumClass.KOTLIN)
}