package br.com.connectrescuedanimal.demo.service

import br.com.connectrescuedanimal.demo.mapper.VacanciesFormMapper
import br.com.connectrescuedanimal.demo.model.VacanciesTest
import br.com.connectrescuedanimal.demo.repository.VacanciesRepository
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows


class VacanciesServiceTest {

    val notFoundMessage = "There is no vacancy available"
    val vacanciesFormMapper: VacanciesFormMapper = mockk()
    val repository: VacanciesRepository = mockk()

    val vacanciesService = VacanciesService(vacanciesFormMapper, repository, notFoundMessage)

    @Test
    fun `must list number of vacancies by type of animals`() {
        val vacancies = VacanciesTest.build()
        every { repository.findByTypeAnimal("gato") } returns mutableListOf(vacancies)

        val result = vacanciesService.getNonprofitOrganizationByTypeAnimal("gato")

        verify(exactly = 1) { repository.findByTypeAnimal("gato") }
        assertThat(result).isEqualTo(mutableListOf(vacancies.nonprofitOrganizationId.toInt()))
    }

    @Test
    fun `when there is no vacancy for the animal returns an exception`() {
        val vacancies = VacanciesTest.build()

        every { repository.findByTypeAnimal("cachorro") } returns emptyList()
        assertThrows<Throwable> {
            vacanciesService.getNonprofitOrganizationByTypeAnimal("cachorro")
        }
    }
}
