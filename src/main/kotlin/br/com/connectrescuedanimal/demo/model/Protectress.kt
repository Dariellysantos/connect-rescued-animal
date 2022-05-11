package br.com.connectrescuedanimal.demo.model

import javax.persistence.*

@Entity
@Table(name = "protectress")
data class Protectress(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long?,
    val name: String,
    val address: String,
    val cpf: Long,
    val description: String,
    val email: String
)