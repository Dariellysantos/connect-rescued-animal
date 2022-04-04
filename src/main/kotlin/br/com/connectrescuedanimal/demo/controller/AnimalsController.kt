package br.com.connectrescuedanimal.demo.controller

import br.com.connectrescuedanimal.demo.dto.AnimalsDto
import br.com.connectrescuedanimal.demo.service.AnimalsService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/animals")
class AnimalsController(private val service: AnimalsService) {
    @PostMapping
    fun register(@RequestBody dtoAnimals: AnimalsDto): AnimalsDto {
        return service.register(dtoAnimals)
    }
}