package br.com.connectrescuedanimal.demo.model

data class Protectress(
    var id: Long? = 1,
    val name: String,
    val address: String,
    val cpf: Long,
    val description: String,
    val historic: MutableList<Long> = mutableListOf(),
    val email: String
)