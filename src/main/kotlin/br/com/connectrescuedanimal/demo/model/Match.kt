package br.com.connectrescuedanimal.demo.model

data class Match(
    var id: Long?,
    val animalId: Long,
    val typeOfVacancyId: Long,
    var matchStatus: MatchsStatus

)