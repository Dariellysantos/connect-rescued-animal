package br.com.connectrescuedanimal.demo.dto

import br.com.connectrescuedanimal.demo.model.SituationStatus
import javax.validation.constraints.NotEmpty

data class AnimalsDto(
    val id: Long,
    val genre: String,
    val breed: String,
    @NotEmpty val type: String,
    val status: SituationStatus = SituationStatus.UNPROTECTED,
    @NotEmpty val protectress: Long
)
