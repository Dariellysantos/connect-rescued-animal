package br.com.connectrescuedanimal.demo.service

import br.com.connectrescuedanimal.demo.dto.MatchDto
import br.com.connectrescuedanimal.demo.dto.RequestMatchDto
import br.com.connectrescuedanimal.demo.mapper.MatchFormMapper
import br.com.connectrescuedanimal.demo.model.Match
import br.com.connectrescuedanimal.demo.model.MatchsStatus
import br.com.connectrescuedanimal.demo.model.SituationStatus
import br.com.connectrescuedanimal.demo.repository.MatchRepository
import org.springframework.stereotype.Service

@Service
class MatchService(
    private val matchFormMapper: MatchFormMapper,
    private val vacanciesService: VacanciesService,
    private val animalsService: AnimalsService,
    private val repository: MatchRepository,
    private val badRequest: String =
        "There is no vacancy for this type of animal",
    private val notFoundMessage: String =
        "vacancy not available"

) {
    fun register(dtoMatch: MatchDto): Match {
        val animal = animalsService.getById(dtoMatch.animalId)
        val vacancy = vacanciesService.getById(dtoMatch.typeOfVacancyId)

        if (animal.type != vacancy.typeAnimal) {
            throw Exception(badRequest)
        }

        val matchMapper = matchFormMapper.map(dtoMatch)
        repository.save(matchMapper)
        return matchMapper
    }

    fun request(dtoMatch: RequestMatchDto, id: Long): Match {
        val matchMapper = repository.getById(id)
        matchMapper.matchStatus = dtoMatch.matchStatus

        val vacancies = vacanciesService.getById(matchMapper.typeOfVacancyId)

        if (matchMapper.matchStatus == MatchsStatus.ACCEPT && vacancies.quantity > 0) {
            vacancies.quantity = vacancies.quantity - 1

            val animal = animalsService.getById(matchMapper.animalId)
            animal.status = SituationStatus.SHELTERED
        } else {
            throw Exception(notFoundMessage)
        }


        return matchMapper
    }
}
