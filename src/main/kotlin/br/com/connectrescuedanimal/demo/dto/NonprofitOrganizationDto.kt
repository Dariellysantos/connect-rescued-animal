package br.com.connectrescuedanimal.demo.dto

import javax.validation.constraints.NotEmpty
import javax.validation.constraints.Size

data class NonprofitOrganizationDto(
    var id: Long,
    @field: NotEmpty @Size(min = 14) val cnpj: Long,
    @field: NotEmpty val numberOfVacancies: Int,
    @field: NotEmpty val address: String,
    val linkPage: String
)
