package KotlinExperience.extendFunc

class ExtendGenericFunc {
}

fun main() {
    val list = mutableMapOf<String, String>()
    myWith(list) {
        keys
        values
    }
}


inline fun<T, Return> myWith(obj: T, operation: T.() -> Return) :Return {
    return obj.operation()
}
