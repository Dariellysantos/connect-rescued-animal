package br.com.connectrescuedanimal.demo.dto

import br.com.connectrescuedanimal.demo.model.Animals
import br.com.connectrescuedanimal.demo.model.MatchsStatus
import br.com.connectrescuedanimal.demo.model.TypeOfVacancy

data class MatchDto (
    val id:Long,
    val animal_id: Animals,
    val type_of_vacancy_id: TypeOfVacancy,
    val matchStatus: MatchsStatus = MatchsStatus.SOLICITADO

)
