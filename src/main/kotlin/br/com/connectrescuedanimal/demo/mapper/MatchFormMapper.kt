package br.com.connectrescuedanimal.demo.mapper

import br.com.connectrescuedanimal.demo.dto.MatchDto
import br.com.connectrescuedanimal.demo.model.Match
import org.springframework.stereotype.Component

@Component
class MatchFormMapper : Mapper<MatchDto, Match> {
    override fun map(t: MatchDto): Match {
        return Match(
            id = t.id,
            animalId = t.animalId,
            typeOfVacancyId = t.typeOfVacancyId,
            matchStatus = t.matchStatus
        )
    }

}
