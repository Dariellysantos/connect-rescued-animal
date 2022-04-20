package br.com.connectrescuedanimal.demo.model

import javax.persistence.*

@Entity
@Table(name = "vacancies")
data class Vacancies(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long,
    @Column(name = "typeanimal")
    val typeAnimal: String,
    var quantity: Long,
    @Column(name = "nonprofitorganizationid")
    val nonprofitOrganizationId: Long
)