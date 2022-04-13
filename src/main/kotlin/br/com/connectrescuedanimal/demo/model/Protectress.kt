package br.com.connectrescuedanimal.demo.model

import javax.persistence.*

@Entity
data class Protectress(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long?,
    val name: String,
    val address: String,
    val cpf: Long,
    val description: String,
    @OneToMany(mappedBy = "match")
    val historic: MutableList<Long> = mutableListOf(),
    val email: String
)