package br.com.connectrescuedanimal.demo.model

import javax.persistence.*

@Entity
@Table(name = "vacancies")
data class TypeOfVacancy(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    @Column(name = "typeofanimal")
    val typeOfAnimal: String,
    val quantity: Int,
    @Column(name = "nonprofitorganization")
    val nonprofitOrganization: Long
)
