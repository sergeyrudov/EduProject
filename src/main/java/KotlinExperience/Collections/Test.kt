package KotlinExperience.Collections

import com.google.common.base.Throwables
import net.bytebuddy.implementation.bytecode.Throw
import java.lang.Exception
import kotlin.jvm.Throws

class Test {
}

fun main() {


    test()
    }


fun test() {
    val v = "rhrth"
    if(v.isBlank()) {
        println("not blank")
    } else {
        println("blank")
        throw Exception("HELLo")

    }
}



