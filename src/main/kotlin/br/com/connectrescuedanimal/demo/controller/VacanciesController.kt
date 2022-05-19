package br.com.connectrescuedanimal.demo.controller

import br.com.connectrescuedanimal.demo.dto.VacanciesDto
import br.com.connectrescuedanimal.demo.dto.VacanciesQuantityDto
import br.com.connectrescuedanimal.demo.model.Vacancies
import br.com.connectrescuedanimal.demo.service.VacanciesService
import org.springframework.cache.annotation.CacheEvict
import org.springframework.cache.annotation.Cacheable
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.*
import javax.validation.Valid


@RestController
@RequestMapping("/vacancies")
class VacanciesController(private val service: VacanciesService) {

    @Transactional
    @PostMapping
    @CacheEvict(value = ["vacanciesTypeAnimal"], allEntries = true)
    fun register(@RequestBody @Valid dtoVacancies: VacanciesDto): Vacancies {
        return service.register(dtoVacancies)
    }

    @GetMapping
    @Cacheable("vacanciesTypeAnimal")
    fun getByIdTypeAnimal(
        @RequestParam typeAnimal: String
    ): MutableList<Int> {
        return service.getNonprofitOrganizationByTypeAnimal(typeAnimal)
    }

    @GetMapping("/report")
    fun report(): List<VacanciesQuantityDto> {
        return service.report()
    }
}