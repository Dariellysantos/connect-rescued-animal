package br.com.connectrescuedanimal.demo.model

data class Vacancies(

    var id: Long,
    val typeAnimal: String,
    val quantity: Long,
    val nonprofitOrganization_id: Long
)
