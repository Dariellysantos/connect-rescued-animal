package br.com.connectrescuedanimal.demo.controller

import br.com.connectrescuedanimal.demo.dto.VacanciesDto
import br.com.connectrescuedanimal.demo.model.Vacancies
import br.com.connectrescuedanimal.demo.service.VacanciesService
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/vacancies")
class VacanciesController(private val service: VacanciesService) {
    @PostMapping
    fun register(@RequestBody dtoVacancies: VacanciesDto): Vacancies {
        return service.register(dtoVacancies)
    }

    @ResponseBody
    fun getFooByIdTypeVacancies(@RequestParam dtoVacancies: VacanciesDto): Vacancies {
        return service.getFooByIdTypeVacancies(dtoVacancies)
    }
}