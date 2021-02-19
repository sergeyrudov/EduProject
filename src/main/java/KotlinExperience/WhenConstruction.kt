package KotlinExperience

class WhenConstruction {
}

fun main() {
   val nameOfMonth = "Март"

    val season: String =
    when(nameOfMonth) {
        "Декабрь", "Январь", "Февраль" -> {
            //season = "Зима"
            "Зима"
        }
        "Март", "Апрель", "Май" -> {
            //season = "Весна"
            "Весна"
        }
        "Июнь", "Июль", "Август" -> {
            //season = "Лето"
            "Лето"
        }
        "Сентябрь", "Октябрь", "Ноябрь" -> {
            //season = "Осень"
            "Осень"
        }
        else -> {
            //season = "Не найден"
            "Не найден"
        }
    }
    println(season)
    println(indexMonth())
}


fun indexMonth() {
    val indexOfMonth = 1

    val season1: String =
        when(indexOfMonth) {
            12, 1, 2 -> {
                "Зима"
            }
            3, 4, 5 -> {
                "Весна"
            }
            6, 7, 8 -> {
                "Лето"
            }
            9, 10, 11 -> {
                "Осень"
            }
            else -> {
                "Не найден"
            }
        }
    println(season1)
}