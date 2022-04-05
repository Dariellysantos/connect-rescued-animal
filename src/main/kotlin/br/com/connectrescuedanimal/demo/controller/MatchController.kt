package br.com.connectrescuedanimal.demo.controller


import br.com.connectrescuedanimal.demo.service.MatchService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/match")
class MatchController (private val service: MatchService){
    @PostMapping
    fun register(@RequestBody dtoMatch: MatchDto): MatchDto {
        return service.register(dtoMatch)
    }