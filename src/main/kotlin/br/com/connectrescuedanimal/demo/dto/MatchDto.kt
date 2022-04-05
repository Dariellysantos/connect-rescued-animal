package br.com.connectrescuedanimal.demo.dto

import br.com.connectrescuedanimal.demo.model.MatchsStatus

data class MatchDto (
    val id: Long?,
    val animal_id: Long,
    val type_of_vacancy_id: Long,
    val matchStatus: MatchsStatus = MatchsStatus.SOLICITADO

)
