package br.com.connectrescuedanimal.demo.model

data class Protectress(
    val id: Long?,
    val name: String,
    val address: String,
    val cpf: Long?,
    val description: String?,
    val historic: ArrayList<Long>?,
    val email: String?
)