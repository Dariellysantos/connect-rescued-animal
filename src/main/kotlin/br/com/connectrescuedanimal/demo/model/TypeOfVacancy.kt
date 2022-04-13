package br.com.connectrescuedanimal.demo.model

import javax.persistence.*

@Entity
data class TypeOfVacancy(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val typeOfAnimal: String,
    val quantity: Int,
    @Enumerated(value = EnumType.STRING)
    val nonprofitOrganization: NonprofitOrganization
)
