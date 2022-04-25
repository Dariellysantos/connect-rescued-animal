package br.com.connectrescuedanimal.demo.service

import br.com.connectrescuedanimal.demo.dto.VacanciesDto
import br.com.connectrescuedanimal.demo.dto.VacanciesQuantityDto
import br.com.connectrescuedanimal.demo.mapper.VacanciesFormMapper
import br.com.connectrescuedanimal.demo.model.Vacancies
import br.com.connectrescuedanimal.demo.repository.VacanciesRepository
import org.springframework.stereotype.Service

@Service
class VacanciesService(
    private val vacanciesFormMapper: VacanciesFormMapper,
    private val repository: VacanciesRepository

) {
    fun register(dtoVacancies: VacanciesDto): Vacancies {
        val vacanciesMapper = vacanciesFormMapper.map(dtoVacancies)
        repository.save(vacanciesMapper)
        return vacanciesMapper
    }

    fun getByIdTypeAnimal(typeAnimal: String): MutableList<Int> {
        val vacancies = repository.findByTypeAnimal(typeAnimal)
        return vacancies.map { it.nonprofitOrganizationId.toInt() }.toMutableList()
    }

    fun getById(id: Long): Vacancies {
        return repository.getById(id)
    }

    fun report(): List<VacanciesQuantityDto> {
        return repository.report()
    }

}
