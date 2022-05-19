package br.com.connectrescuedanimal.demo.service

import br.com.connectrescuedanimal.demo.dto.VacanciesDto
import br.com.connectrescuedanimal.demo.dto.VacanciesQuantityDto
import br.com.connectrescuedanimal.demo.mapper.VacanciesFormMapper
import br.com.connectrescuedanimal.demo.model.Vacancies
import br.com.connectrescuedanimal.demo.repository.VacanciesRepository
import org.springframework.stereotype.Service
import java.time.LocalDate

@Service
class VacanciesService(
    private val vacanciesFormMapper: VacanciesFormMapper,
    private val repository: VacanciesRepository,
    private val notFoundMessage: String =
        "There is no vacancy available",
) {
    fun register(dtoVacancies: VacanciesDto): Vacancies {
        val vacanciesMapper = vacanciesFormMapper.map(dtoVacancies)
        repository.save(vacanciesMapper)
        vacanciesMapper.creationDate = LocalDate.now()
        return vacanciesMapper
    }

    fun getNonprofitOrganizationByTypeAnimal(typeAnimal: String): MutableList<Int> {
        val vacancies = repository.findByTypeAnimal(typeAnimal)
        if (vacancies.isNotEmpty()) {
            return vacancies.map { it.nonprofitOrganizationId.toInt() }.toMutableList()
        } else {
            throw Exception(notFoundMessage)
        }
    }

    fun getById(id: Long): Vacancies {
        return repository.getById(id)
    }

    fun report(): List<VacanciesQuantityDto> {
        return repository.report()
    }

}
