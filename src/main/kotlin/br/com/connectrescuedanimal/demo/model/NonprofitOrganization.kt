package br.com.connectrescuedanimal.demo.model

data class NonprofitOrganization(
    val id: Long,
    val cnpj: Long,
    val numberOfVacancies: Int,
    val address: String,
    val linkPage: String
)