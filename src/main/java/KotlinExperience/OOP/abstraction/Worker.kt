package KotlinExperience.OOP.abstraction


abstract class Employee(val name: String, val age: Int) {

    open fun aboutMe() {
        println("some info about me\n")
    }

    abstract fun work()
}


class Seller(name: String, age: Int) : Employee(name, age) {
    override fun work() {
        println("I am sell products\n")
    }
}

class Mechanic(name: String, age: Int, var qualified: Boolean) : Employee(name, age), CleanAfterWorkingDay {
    override fun work() {
        println("My qualification is $qualified")
    }

    override fun cleaning() {
        println("I am clean my working space\n")
    }
}

class Doctor(name: String, age: Int, var direction: String) : Employee(name, age), CleanAfterWorkingDay {
    override fun work() {
        println("I am healing, and my direction is $direction")
    }

    override fun cleaning() {
        println("I am clean my working space\n")
    }


}

fun main() {
    val employees = mutableListOf<Employee>()

    employees.add(Seller("Leonid", 22))
    employees.add(Mechanic("Stepan", 32, true))
    employees.add(Doctor("Egor", 40, "oftalmolog"))

    val cleaners = employees.filter { it is CleanAfterWorkingDay }.map { it as CleanAfterWorkingDay }
    for (cleaner in cleaners) {
        cleaner.cleaning()
    }


    for (worker in employees) {
        worker.work()
        if (worker is CleanAfterWorkingDay) { // smart cast, or worker as CleanAfterWorkingDay
            worker.cleaning()
        }
    }
}

// operator is to check that object implement some interface
// as smart cast object