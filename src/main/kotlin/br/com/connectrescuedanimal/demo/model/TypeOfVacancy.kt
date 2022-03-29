package br.com.connectrescuedanimal.demo.model

data class TypeOfVacancy(
    val id: Long,
    val typeOfAnimal: String,
    val quantity: Int,
    val nonprofitOrganization: NonprofitOrganization
)
