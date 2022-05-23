package br.com.connectrescuedanimal.demo.controller


import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get
import org.springframework.test.web.servlet.setup.MockMvcBuilders
import org.springframework.web.context.WebApplicationContext

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class VacanciesControllerTest {

    @Autowired
    private lateinit var webApplicationContext: WebApplicationContext
    private lateinit var mockMvc: MockMvc

    companion object {
        private const val RESOURCE = "/vacancies"
        private const val RESOURCE_PARAMS = RESOURCE.plus("%s")

    }

    @BeforeEach
    fun setup() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build()
    }

    @Test
    fun `must return status 200 when there is a vacancy for the wanted animal`() {
        mockMvc.get(RESOURCE_PARAMS.format("?typeAnimal=cachorro")).andExpect { status { is2xxSuccessful() } }
    }

    @Test
    fun `must return status 500 when there is no vacancy for the sought animal`() {
        mockMvc.get(RESOURCE_PARAMS.format("?typeAnimal=gato")).andExpect { status { is5xxServerError() } }
    }

    @Test
    fun `must return status 200 when there are vacancies in the register`() {
        mockMvc.get(RESOURCE_PARAMS.format("/report")).andExpect { status { is2xxSuccessful() } }
    }
}