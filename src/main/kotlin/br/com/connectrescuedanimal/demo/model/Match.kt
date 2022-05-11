package br.com.connectrescuedanimal.demo.model

import javax.persistence.*

@Entity
@Table(name = "matchVacancies")
data class Match(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long?,
    val animalId: Long,
    @Column(name = "typeOfVacancyId")
    val typeOfVacancyId: Long,
    @Enumerated(value = EnumType.STRING)
    @Column(name = "matchstatus")
    var matchStatus: MatchsStatus,

    )