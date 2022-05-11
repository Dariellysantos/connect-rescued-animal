package br.com.connectrescuedanimal.demo.model

import javax.persistence.*

@Entity
@Table(name = "animal")
data class Animal(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long?,
    val genre: String,
    val breed: String,
    val type: String,
//    @ManyToOne
//    @JoinColumn(name = "protectress")
    val protectress: Long,
    @Enumerated(value = EnumType.STRING)
    var status: SituationStatus = SituationStatus.UNPROTECTED,
)