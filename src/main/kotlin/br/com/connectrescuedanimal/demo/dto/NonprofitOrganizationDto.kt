package br.com.connectrescuedanimal.demo.dto


import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull

data class NonprofitOrganizationDto(
    var id: Long,
    @field: NotNull val cnpj: Long,
    val numberOfVacancies: Int,
    @field: NotEmpty val address: String,

    val linkPage: String
)
