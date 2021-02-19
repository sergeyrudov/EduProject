package KotlinExperience.NullableTypes

class LengthCheck {
}

fun main() {
    val a:String? = null
    val b:String? = "2234234"
    val z:String?
    val c:String? = ""

    // driver?.length if driver is null, it will be returned
    val driver: String? = null
    println(driver?.length)


    // driver!!.length if driver is null, will be returned NPE
    val driver1: String? = null
    //println(driver1!!.length)


    val result:Int? = (a?.length?:0) + (b?.length?:0) + (c?.length?:0)
    println(result)

    val n:String? = "1234"
    val rslt: Int = n?.length?:0
    println(rslt)
}