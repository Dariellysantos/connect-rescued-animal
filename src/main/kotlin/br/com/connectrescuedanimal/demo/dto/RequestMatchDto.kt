package br.com.connectrescuedanimal.demo.dto

import br.com.connectrescuedanimal.demo.model.MatchsStatus

data class RequestMatchDto(
    val id: Long,
    var matchStatus: MatchsStatus = MatchsStatus.ACEITO
)
