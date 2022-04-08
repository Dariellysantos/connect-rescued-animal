package br.com.connectrescuedanimal.demo.dto

import javax.validation.constraints.NotEmpty
import javax.validation.constraints.Size

data class ProtectressRegisterDto(
    var id: Long,
    @NotEmpty val name: String,
    @NotEmpty val address: String,
    @NotEmpty @Size(min = 11) val cpf: Long,
    val description: String,
    @NotEmpty val email: String
)
