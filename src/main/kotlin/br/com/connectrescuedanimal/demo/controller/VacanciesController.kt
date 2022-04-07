package br.com.connectrescuedanimal.demo.controller

import br.com.connectrescuedanimal.demo.dto.VacanciesDto
import br.com.connectrescuedanimal.demo.model.Vacancies
import br.com.connectrescuedanimal.demo.service.VacanciesService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/vacancies")
class VacanciesController(private val service: VacanciesService) {
    @PostMapping
    fun register(@RequestBody dtoVacancies: VacanciesDto): Vacancies {
        return service.register(dtoVacancies)
    }

//    @GetMapping("/{type-animal}")
//    fun getFooByIdTypeVacancies(@PathVariable( type = "type-animal") Integer VacanciesDto.typeAnimal) {
//        return service.getFooByIdTypeVacancies(dtoVacancies)
//    }
}