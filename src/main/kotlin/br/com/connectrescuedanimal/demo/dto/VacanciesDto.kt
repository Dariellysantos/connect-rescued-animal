package br.com.connectrescuedanimal.demo.dto

import javax.validation.constraints.NotEmpty

data class VacanciesDto(
    var id: Long,
    @field: NotEmpty val typeAnimal: String,
    @field: NotEmpty var quantity: Long,
    val nonprofitOrganizationId: Long
)
