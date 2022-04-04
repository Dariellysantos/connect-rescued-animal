package br.com.connectrescuedanimal.demo.controller

import br.com.connectrescuedanimal.demo.dto.NonprofitOrganizationDto
import br.com.connectrescuedanimal.demo.service.NonprofitOrganizationService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/nonprofit-organization")
class NonprofitOrganizationController(private val service: NonprofitOrganizationService) {
    @PostMapping
    fun register(@RequestBody dtoNonprofitOrganization: NonprofitOrganizationDto): NonprofitOrganizationDto {
        return service.register(dtoNonprofitOrganization)
    }
}