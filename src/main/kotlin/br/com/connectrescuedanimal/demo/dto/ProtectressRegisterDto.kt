package br.com.connectrescuedanimal.demo.dto

import javax.validation.constraints.NotEmpty
import javax.validation.constraints.Size

data class ProtectressRegisterDto(
    var id: Long,
    @field: NotEmpty val name: String,
    @field: NotEmpty val address: String,
    @field: NotEmpty @Size(min = 11) val cpf: Long,
    val description: String,
    @field: NotEmpty val email: String
)
