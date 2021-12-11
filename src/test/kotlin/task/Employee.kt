package automation.api.task

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@JsonPropertyOrder("id", "name", "surname", "department", "salary")

@Entity
data class Employee(
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @JsonIgnore
    var id:Long = 0,
    var name: String? = null,
    var surname: String? = null,
    val department: String? = null,
    var salary: Int? = null
)
