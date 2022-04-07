package br.com.connectrescuedanimal.demo.service

import br.com.connectrescuedanimal.demo.dto.VacanciesDto
import br.com.connectrescuedanimal.demo.mapper.VacanciesFormMapper
import br.com.connectrescuedanimal.demo.model.Vacancies
import org.springframework.stereotype.Service

@Service
class VacanciesService(
    var vacancies: List<Vacancies>,
    private val vacanciesFormMapper: VacanciesFormMapper
) {
    fun register(dtoVacancies: VacanciesDto): Vacancies {
        var vacanciesMapper = vacanciesFormMapper.map(dtoVacancies)
        vacanciesMapper.id = vacancies.size.toLong() + 1


        vacancies = vacancies.plus(
            vacanciesMapper
        )
        return vacanciesMapper
    }

    fun getByIdTypeAnimal(typeAnimal: String): MutableList<Int> {
        var listType = mutableListOf<Int>()
        val listTypeAnimal = vacancies.forEach { t ->
            if (t.typeAnimal == typeAnimal) {
                listType.add(t.nonprofitOrganizationId.toInt())
            }
        }
        return listType

    }
}
