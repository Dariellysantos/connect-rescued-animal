package br.com.connectrescuedanimal.demo.service

import br.com.connectrescuedanimal.demo.dto.MatchDto
import br.com.connectrescuedanimal.demo.mapper.MatchFormMapper
import br.com.connectrescuedanimal.demo.model.Match
import org.springframework.stereotype.Service

@Service
class MatchService(
    private var match: List<Match> = listOf(),
    private val matchFormMapper: MatchFormMapper
) {
    fun register(dtoMatch: MatchDto): Match {

        var matchMapper = matchFormMapper.map(dtoMatch)
        matchMapper.id = match.size.toLong() + 1

        match = match.plus(
            matchMapper
        )
        return matchMapper

    }
}
