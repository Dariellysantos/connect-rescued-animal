package br.com.connectrescuedanimal.demo.dto

data class ProtectressRegisterDTO(
    val id: Long?,
    val name: String,
    val address: String,
    val cpf: Long,
    val description: String,
    val email: String
)
