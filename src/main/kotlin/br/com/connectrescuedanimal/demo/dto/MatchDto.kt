package br.com.connectrescuedanimal.demo.dto

import br.com.connectrescuedanimal.demo.model.MatchsStatus

data class MatchDto (
    val id: Long?,
    val animalId: Long,
    val typeOfVacancyId: Long,
    var matchStatus: MatchsStatus = MatchsStatus.REQUESTED

)
