package br.com.connectrescuedanimal.demo.service

import br.com.connectrescuedanimal.demo.dto.VacanciesDto
import br.com.connectrescuedanimal.demo.exception.NotFoundException
import br.com.connectrescuedanimal.demo.mapper.VacanciesFormMapper
import br.com.connectrescuedanimal.demo.model.Vacancies
import org.springframework.stereotype.Service

@Service
class VacanciesService(
    var vacancies: List<Vacancies>,
    private val vacanciesFormMapper: VacanciesFormMapper,
    private val notFoundMessage: String = "\n" +
            "There is no vacancy for this type of animal"
) {
    fun register(dtoVacancies: VacanciesDto): Vacancies {
        val vacanciesMapper = vacanciesFormMapper.map(dtoVacancies)
        vacanciesMapper.id = vacancies.size.toLong() + 1


        vacancies = vacancies.plus(
            vacanciesMapper
        )
        return vacanciesMapper
    }

    fun getByIdTypeAnimal(typeAnimal: String): MutableList<Int> {
        val listType = mutableListOf<Int>()
        val listTypeAnimal = vacancies.forEach { t ->
            if (t.typeAnimal == typeAnimal) {
                listType.add(t.nonprofitOrganizationId.toInt())
            } else {
                throw Exception(NotFoundException(notFoundMessage))
            }
        }
        return listType

    }

    fun getById(id: Long): Vacancies {
        val vacanciesById = vacancies.first { t ->
            t.id == id
        }
        return vacanciesById
    }

}
