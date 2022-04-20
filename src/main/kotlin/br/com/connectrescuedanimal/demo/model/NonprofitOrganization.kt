package br.com.connectrescuedanimal.demo.model

import javax.persistence.*

@Entity
@Table(name = "nonprofitorganization")
data class NonprofitOrganization(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long,
    val cnpj: Long,
    @Column(name = "numberofvacancies")
    val numberOfVacancies: Int,
    val address: String,
    @Column(name = "linkpage")
    val linkPage: String
)