package br.com.connectrescuedanimal.demo.model

import java.time.LocalDate
import javax.persistence.*

@Entity
@Table(name = "vacancies")
data class Vacancies(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    @Column(name = "typeanimal")
    val typeAnimal: String,
    var quantity: Long,
    @Column(name = "nonprofitOrganizationid")
    val nonprofitOrganizationId: Long,
    var creationDate: LocalDate?,
)