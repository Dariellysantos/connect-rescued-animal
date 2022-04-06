package br.com.connectrescuedanimal.demo.model

data class Match(
    var id: Long?,
    val animal_id: Long,
    val type_of_vacancy_id: Long,
    var matchStatus: MatchsStatus

)