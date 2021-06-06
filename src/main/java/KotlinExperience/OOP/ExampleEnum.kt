package KotlinExperience.OOP

internal enum class WeekDays(val android: String, val ios:String) {
    LOGIN("Login", "login"),
    SIGN_IN("Sign in", "sign in"),
    ABOUT("About", "about"),
    TRANSFER("Transfer", "transfer"),
    SETTINGS("Settings", "settings");

    override fun toString(): String {
        return ios
    }
}



fun main() {
    println(WeekDays.LOGIN)
}