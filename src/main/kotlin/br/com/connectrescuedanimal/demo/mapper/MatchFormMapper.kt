package br.com.connectrescuedanimal.demo.mapper

import br.com.connectrescuedanimal.demo.dto.AnimalsDto
import br.com.connectrescuedanimal.demo.dto.MatchDto
import br.com.connectrescuedanimal.demo.model.Animals
import br.com.connectrescuedanimal.demo.model.Match
import br.com.connectrescuedanimal.demo.model.MatchsStatus
import br.com.connectrescuedanimal.demo.model.TypeOfVacancy

class MatchFormMapper : Mapper<MatchDto, Match>{
    override fun map(t: MatchDto): Match {
   return Match (
       id = t.id,
       animal_id = t.animal_id,
     type_of_vacancy_id=t.type_of_vacancy_id,
       matchStatus= t.matchsStatus
        )
    }

}
