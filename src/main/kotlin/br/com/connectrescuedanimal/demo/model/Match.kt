package br.com.connectrescuedanimal.demo.model

import javax.persistence.*

@Entity
data class Match(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long?,
    val animalId: Long,
    val typeOfVacancyId: Long,
    @OneToOne
    var matchStatus: MatchsStatus

)