package br.com.connectrescuedanimal.demo.dto

import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull

data class ProtectressRegisterDto(
    var id: Long,
    @field: NotEmpty val name: String,
    @field: NotEmpty val address: String,
    @field: NotNull val cpf: Long,
    val description: String,
    @field: NotEmpty val email: String
)
