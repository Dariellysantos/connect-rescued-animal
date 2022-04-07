package br.com.connectrescuedanimal.demo.model

data class Animals(
    var id: Long?,
    val genre: String,
    val breed: String,
    val type: String,
    val status: SituationStatus = SituationStatus.UNPROTECTED,
    val protectress: Long
)