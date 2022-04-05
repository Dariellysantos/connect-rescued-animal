package br.com.connectrescuedanimal.demo.dto

data class NonprofitOrganizationDto(
    var id: Long,
    val cnpj: Long,
    val numberOfVacancies: Int,
    val address: String,
    val linkPage: String
)
