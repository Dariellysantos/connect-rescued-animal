package br.com.connectrescuedanimal.demo.dto

import java.time.LocalDate
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull

data class VacanciesDto(
    var id: Long,
    @field: NotEmpty val typeAnimal: String,
    @field:NotNull var quantity: Long,
    val nonprofitOrganizationId: Long,
    val creationDate: LocalDate?,
)
