package KotlinExperience.OOP.generic

interface MyList<T> {
    fun get(index:Int): T
    fun add(string:T)
    fun remove(element: T)
    fun removeAt(index: Int)
    fun size(): Int
}



/* example of Map
interface MyList<T, R> {
    fun get(index:Int): T
    fun add(string:T, element:R)
    fun remove(element: T)
    fun removeAt(index: Int)
    fun size(): Int
}*/
