package br.com.connectrescuedanimal.demo.model

import javax.persistence.*

@Entity
@Table(name = "nonprofitOrganization")
data class NonprofitOrganization(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val cnpj: Long,
    @Column(name = "numberofvacancies")
    val numberOfVacancies: Int,
    val address: String,
    @Column(name = "linkpage")
    val linkPage: String,
)