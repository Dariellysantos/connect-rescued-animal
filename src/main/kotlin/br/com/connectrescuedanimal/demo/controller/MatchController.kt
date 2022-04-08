package br.com.connectrescuedanimal.demo.controller


import br.com.connectrescuedanimal.demo.dto.MatchDto
import br.com.connectrescuedanimal.demo.dto.RequestMatchDto
import br.com.connectrescuedanimal.demo.model.Match
import br.com.connectrescuedanimal.demo.service.MatchService
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/match")
class MatchController(private val service: MatchService) {
    @PostMapping
    fun register(@RequestBody dtoMatch: MatchDto): Match {
        return service.register(dtoMatch)
    }

    @PutMapping("/{id}")
    fun request(@PathVariable id: Long, @RequestBody dtoMatch: RequestMatchDto): Match {
        return service.request(dtoMatch, id)
    }
}