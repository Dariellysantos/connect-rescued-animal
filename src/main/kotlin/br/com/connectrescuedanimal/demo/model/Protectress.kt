package br.com.connectrescuedanimal.demo.model

import java.util.Objects

data class Protectress(
    val id: Long,
    val name: String,
    val address: Objects,
    val cpf: Long,
    val description: String,
    val historic: ArrayList<Long>,
    val email: String
)