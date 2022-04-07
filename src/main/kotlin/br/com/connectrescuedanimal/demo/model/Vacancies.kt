package br.com.connectrescuedanimal.demo.model

data class Vacancies(

    var id: Long,
    val typeAnimal: String,
    var quantity: Long,
    val nonprofitOrganizationId: Long
)
