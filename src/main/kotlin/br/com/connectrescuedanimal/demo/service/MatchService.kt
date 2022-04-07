package br.com.connectrescuedanimal.demo.service

import br.com.connectrescuedanimal.demo.dto.MatchDto
import br.com.connectrescuedanimal.demo.dto.RequestMatchDto
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

    fun request(dtoMatch: RequestMatchDto): Match {
        val matchMapper = match.stream().filter { t ->
            t.id == dtoMatch.id
        }.findFirst().get()
        matchMapper.matchStatus = dtoMatch.matchStatus
        return matchMapper

    }
}
