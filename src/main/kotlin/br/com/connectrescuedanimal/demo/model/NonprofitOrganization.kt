package br.com.connectrescuedanimal.demo.model

import java.util.Objects

data class NonprofitOrganization(
    val id: Long,
    val cnpj: Long,
    val numberOfVacancies: Int,
    val address: Objects,
    val linkPage: String
)