package KotlinExperience.LambdaAndAnonymousMethods

class Player(var name:String, var number:Int, var record:Int) {
    val makeWithNumber:String.(Int) -> String = {"$this $it"}

    val nameWithNumber
    get() = name.makeWithNumber(number)

    fun calculate(howCanWeDoThat: (Int) -> String) : String {
        val result = howCanWeDoThat(this.record)
        return result
    }

    fun addRecord() {
        var countRecord = this.record
        val incrementScore: () -> Int = {
            countRecord+=1
            countRecord
        }
        this.record = incrementScore()
    }
}


fun main() {
    val player = Player("John", 1, 35)
    val playerNameWithNumber: Player.() -> String = {"${this.name} ${this.number}"}
    val calculateRecord: (Int) -> String = {
        when(it) {
            in 0..40 -> "not bad record"
            in 41..80 -> "Medium"
            in 81..100 -> "Great"
            else -> "no value"
        }
    }

    //println(player.nameWithNumber)
    //println(player.playerNameWithNumber())
    //println(player.calculateRecord())
    /*println(player.calculate {
        when(it) {
            in 0..40 -> "not bad record"
            in 41..80 -> "Medium"
            in 81..100 -> "Great"
            else -> "no value"
        }
    })*/


    println(player.addRecord())
    println(player.record)

    println(player.addRecord())
    println(player.record)
    
    println(player.calculate(calculateRecord))



}