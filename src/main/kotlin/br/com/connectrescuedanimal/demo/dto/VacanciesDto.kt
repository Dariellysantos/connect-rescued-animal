package br.com.connectrescuedanimal.demo.dto

import javax.validation.constraints.NotEmpty

data class VacanciesDto(
    var id: Long,
    @NotEmpty val typeAnimal: String,
    @NotEmpty var quantity: Long,
    val nonprofitOrganizationId: Long
)
