package br.com.connectrescuedanimal.demo.model

data class Animals(
    val id: Long,
    val genre: String,
    val breed: String,
    val type: String,
    val status: SituationStatus = SituationStatus.DESABRIGADO,
    val protectress: Protectress
)