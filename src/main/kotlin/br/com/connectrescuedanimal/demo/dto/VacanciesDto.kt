package br.com.connectrescuedanimal.demo.dto

data class VacanciesDto(
    var id: Long,
    val typeAnimal: String,
    val quantity: Long,
    val nonprofitOrganization_id: Long
)
