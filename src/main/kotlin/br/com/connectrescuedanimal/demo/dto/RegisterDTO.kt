package br.com.connectrescuedanimal.demo.dto

data class RegisterDTO(
    val id: Long?,
    val name: String,
    val address: String,
    val cpf: Long,
    val description: String,
    val email: String
)
