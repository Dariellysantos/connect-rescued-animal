package br.com.connectrescuedanimal.demo.dto

import br.com.connectrescuedanimal.demo.model.SituationStatus

data class AnimalsDto(
    val id: Long,
    val genre: String,
    val breed: String,
    val type: String,
    val status: SituationStatus = SituationStatus.UNPROTECTED,
    val protectress: Long
)
