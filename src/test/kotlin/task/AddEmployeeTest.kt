package automation.api.task

import automation.api.EmployeeController
import com.github.javafaker.Faker
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AddEmployeeTest {

    @Test
    fun createEmployee() {
        val user = Employee(
            name = Faker.instance().name().firstName(),
            surname = Faker.instance().name().lastName(),
            salary = 1000,
            department = Faker.instance().commerce().department()
        )

        EmployeeController.createEmployee(user)
    }

    @Test
    fun getEmployee() {
        val user = EmployeeController.getEmployee(75)
        val model = Employee(
            name = "Emory",
            surname = "Herman",
            salary = 1000,
            department = "Computers"
        )
        println("WAIT")
        assertThat(user).isEqualTo(model)
    }
}

