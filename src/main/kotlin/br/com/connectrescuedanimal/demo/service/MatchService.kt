package br.com.connectrescuedanimal.demo.service

import br.com.connectrescuedanimal.demo.dto.AnimalsDto
import br.com.connectrescuedanimal.demo.dto.MatchDto
import br.com.connectrescuedanimal.demo.mapper.AnimalsFormMapper
import br.com.connectrescuedanimal.demo.mapper.MatchFormMapper
import org.springframework.stereotype.Service

@Service
class MatchService(private var match: List<MatchDto> = ArrayList(),
                   private val matchFormMapper: MatchFormMapper
) {
    fun register(dtoMatch: MatchDto): MatchDto {
        match.plus(
            matchFormMapper.map(dtoMatch)
        )
        return dtoMatch

    }
}
