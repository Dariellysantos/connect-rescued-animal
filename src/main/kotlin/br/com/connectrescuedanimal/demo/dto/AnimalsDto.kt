package br.com.connectrescuedanimal.demo.dto

import br.com.connectrescuedanimal.demo.model.SituationStatus
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull

data class AnimalsDto(
    val id: Long,
    val genre: String,
    val breed: String,
    @field: NotEmpty val type: String,
    val status: SituationStatus = SituationStatus.UNPROTECTED,
    @field: NotNull val protectress: Long
)
