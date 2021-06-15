package KotlinExperience.OOP.generic


class MyArrayList<T> : MyList<T> {
    var array = arrayOfNulls<Any>(10)
    var size = 0

    override fun get(index: Int): T {
        if (index in 0 until size) {
            array[index]?.let {
                return it as T
            }
        }
        throw IndexOutOfBoundsException()
    }

    override fun add(string: T) {
        if (size >= array.size) {
            array = array.copyOf(array.size * 2)
        }
        array[size] = string
        size++
    }

    override fun remove(element: T) {
        for ((index, string) in array.withIndex()) {
            if (string == element) {
                removeAt(index)
                return
            }
        }
    }

    override fun removeAt(index: Int) {
        if (index in 0 until size) {
            for (i in index until size -1) {
                array[i] = array[i +1]
            }
            size--
        } else {
            throw IndexOutOfBoundsException()
        }
    }

    override fun size(): Int {
        return size
    }
}

fun main() {
    val list:MyList<String> = MyArrayList()
    //val list:MyList<Int> = MyArrayList()
    for (i in 0..100) {
        list.add("$i")
    }

    for (i in 0..90) {
        list.removeAt(0)
    }

    for (i in 0 until list.size()) {
        println(list.get(i))
    }
}