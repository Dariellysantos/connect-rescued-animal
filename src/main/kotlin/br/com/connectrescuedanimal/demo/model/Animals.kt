package br.com.connectrescuedanimal.demo.model

import javax.persistence.*

@Entity
data class Animals(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long?,
    val genre: String,
    val breed: String,
    val type: String,
    @Enumerated(value = EnumType.STRING)
    var status: SituationStatus = SituationStatus.UNPROTECTED,
    val protectress: Long
)