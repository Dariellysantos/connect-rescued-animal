package br.com.connectrescuedanimal.demo.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Vacancies(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long,
    val typeAnimal: String,
    var quantity: Long,
    val nonprofitOrganizationId: Long
)
