package br.com.connectrescuedanimal.demo.controller

import br.com.connectrescuedanimal.demo.dto.AnimalsDto
import br.com.connectrescuedanimal.demo.model.Animal
import br.com.connectrescuedanimal.demo.service.AnimalsService
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid


@RestController
@RequestMapping("/animals")
class AnimalsController(private val service: AnimalsService) {
    @Transactional
    @PostMapping
    fun register(@RequestBody @Valid dtoAnimals: AnimalsDto): Animal {
        return service.register(dtoAnimals)
    }
}