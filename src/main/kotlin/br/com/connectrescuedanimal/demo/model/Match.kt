package br.com.connectrescuedanimal.demo.model

import org.springframework.beans.factory.config.YamlProcessor.MatchStatus

data class Match (
    val id:Long,
    val animal_id: Animals,
    val type_of_vacancy_id: TypeOfVacancy,
    val matchStatus: MatchsStatus = MatchsStatus.SOLICITADO

        )