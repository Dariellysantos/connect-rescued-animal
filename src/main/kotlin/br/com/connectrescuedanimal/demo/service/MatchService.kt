package br.com.connectrescuedanimal.demo.service

import br.com.connectrescuedanimal.demo.dto.MatchDto
import br.com.connectrescuedanimal.demo.dto.RequestMatchDto
import br.com.connectrescuedanimal.demo.exception.NotFoundException
import br.com.connectrescuedanimal.demo.mapper.MatchFormMapper
import br.com.connectrescuedanimal.demo.model.Match
import br.com.connectrescuedanimal.demo.model.MatchsStatus
import br.com.connectrescuedanimal.demo.model.SituationStatus
import org.springframework.stereotype.Service

@Service
class MatchService(
    private var match: List<Match> = listOf(),
    private val matchFormMapper: MatchFormMapper,
    private val vacanciesService: VacanciesService,
    private val animalsService: AnimalsService,
    private val notFoundMessage: String = "\n" +
            "vacancy not available"
) {
    fun register(dtoMatch: MatchDto): Match {

        val matchMapper = matchFormMapper.map(dtoMatch)
        matchMapper.id = match.size.toLong() + 1

        match = match.plus(
            matchMapper
        )
        return matchMapper
    }

    fun request(dtoMatch: RequestMatchDto, id: Long): Match {
        val matchMapper = match.first { t ->
            t.id == id
        }
        matchMapper.matchStatus = dtoMatch.matchStatus

        val vacancies = vacanciesService.getById(matchMapper.typeOfVacancyId)
        if (matchMapper.matchStatus == MatchsStatus.ACCEPT && vacancies.quantity > 0) {
            vacancies.quantity = vacancies.quantity - 1

            val animal = animalsService.getById(matchMapper.animalId)
            animal.status = SituationStatus.SHELTERED
        } else {
            throw Exception(NotFoundException(notFoundMessage))
        }


        return matchMapper
    }
}
