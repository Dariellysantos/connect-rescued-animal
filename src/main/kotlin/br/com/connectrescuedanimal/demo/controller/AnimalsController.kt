package br.com.connectrescuedanimal.demo.controller

import br.com.connectrescuedanimal.demo.dto.AnimalsDto
import br.com.connectrescuedanimal.demo.model.Animals
import br.com.connectrescuedanimal.demo.service.AnimalsService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid


@RestController
@RequestMapping("/animals")
class AnimalsController(private val service: AnimalsService) {
    @PostMapping
    fun register(@RequestBody @Valid dtoAnimals: AnimalsDto): Animals {
        return service.register(dtoAnimals)
    }
}