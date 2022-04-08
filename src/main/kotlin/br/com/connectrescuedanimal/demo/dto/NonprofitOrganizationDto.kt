package br.com.connectrescuedanimal.demo.dto

import javax.validation.constraints.NotEmpty
import javax.validation.constraints.Size

data class NonprofitOrganizationDto(
    var id: Long,
    @NotEmpty @Size(min = 14) val cnpj: Long,
    @NotEmpty val numberOfVacancies: Int,
    @NotEmpty val address: String,
    val linkPage: String
)
