package br.com.connectrescuedanimal.demo.service

import br.com.connectrescuedanimal.demo.dto.MatchDto
import br.com.connectrescuedanimal.demo.dto.RequestMatchDto
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
    private val animalsService: AnimalsService
) {
    fun register(dtoMatch: MatchDto): Match {

        val matchMapper = matchFormMapper.map(dtoMatch)
        matchMapper.id = match.size.toLong() + 1

        match = match.plus(
            matchMapper
        )
        return matchMapper
    }

    fun request(dtoMatch: RequestMatchDto): Match {

        val matchMapper = match.first { t ->
            t.id == dtoMatch.id
        }
        matchMapper.matchStatus = dtoMatch.matchStatus

        val quantityVacancies = vacanciesService.getById(matchMapper.typeOfVacancyId).quantity
        if (matchMapper.matchStatus == MatchsStatus.ACCEPT && quantityVacancies < 0) {
            quantityVacancies - 1
        }

        var situationStatus = animalsService.getById(matchMapper.animalId).status
        situationStatus = SituationStatus.SHELTERED

        return matchMapper
    }
}
