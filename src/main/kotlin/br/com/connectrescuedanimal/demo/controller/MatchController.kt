package br.com.connectrescuedanimal.demo.controller


import br.com.connectrescuedanimal.demo.dto.MatchDto
import br.com.connectrescuedanimal.demo.dto.RequestMatchDto
import br.com.connectrescuedanimal.demo.model.Match
import br.com.connectrescuedanimal.demo.service.MatchService
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.*
import javax.validation.Valid


@RestController
@RequestMapping("/match")
class MatchController(private val service: MatchService) {
    @Transactional
    @PostMapping
    fun register(@RequestBody @Valid dtoMatch: MatchDto): Match {
        return service.register(dtoMatch)
    }

    @Transactional
    @PutMapping("/{id}")
    fun request(@PathVariable id: Long, @RequestBody dtoMatch: RequestMatchDto): Match {
        return service.request(dtoMatch, id)
    }
}