package br.com.connectrescuedanimal.demo.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class NonprofitOrganization(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long,
    val cnpj: Long,
    val numberOfVacancies: Int,
    val address: String,
    val linkPage: String
)