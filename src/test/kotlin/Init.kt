package automation.api;

import KotlinExperience.WithLet.name
import io.qameta.allure.TmsLink
import org.assertj.core.api.SoftAssertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.*
import java.util.stream.Stream


data class userDto(
    val appium: String,
    val isRestart: Boolean,
    val isKrolevarka:Any?
)



@DisplayName("E2E")
class InitData {

    @TmsLink("Some info for TMS")
    @ParameterizedTest(name = "And info for jenkins.etc")
    @MethodSource("prepareData")
    @Tag("param")
    @Test
    fun `validate data`(data: userDto) {
        SoftAssertions.assertSoftly {
            it.assertThat(data.appium).isEqualTo(userDto::appium)
            it.assertThat(data.isRestart).isEqualTo(userDto::isRestart)
            it.assertThat(data.isKrolevarka).isEqualTo(userDto::isKrolevarka)
        }
    }


    fun prepareData(): Stream<Arguments> {
        return Stream.of(Arguments.of(
            userDto(
                appium = "Some data to start appium",
                isRestart = false,
                isKrolevarka = listOf(UUID.randomUUID()))
        )
        )
    }
}
