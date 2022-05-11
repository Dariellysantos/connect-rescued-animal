package br.com.connectrescuedanimal.demo.mapper

import br.com.connectrescuedanimal.demo.dto.VacanciesDto
import br.com.connectrescuedanimal.demo.model.Vacancies
import org.springframework.stereotype.Component

@Component
class VacanciesFormMapper : Mapper<VacanciesDto, Vacancies> {
    override fun map(t: VacanciesDto): Vacancies {
        return Vacancies(
            id = t.id,
            typeAnimal = t.typeAnimal,
            quantity = t.quantity,
            nonprofitOrganizationId = t.nonprofitOrganizationId,
            creationDate = t.creationDate
        )
    }
}
