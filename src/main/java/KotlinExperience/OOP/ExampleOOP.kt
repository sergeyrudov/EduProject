package KotlinExperience.OOP

class ExampleOOP {
    var name: String = ""
        get() = field.toLowerCase().capitalize()

    var age: Int = 0
        set(value) {
            if (value >= 0) {
                field = value
            }
        }

    var weight = 0f
        set(value) {
            if (value >= 0) {
                field = value
            }
        }
}