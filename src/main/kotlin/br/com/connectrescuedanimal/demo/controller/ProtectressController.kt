package br.com.connectrescuedanimal.demo.controller

import br.com.connectrescuedanimal.demo.dto.ProtectressRegisterDTO
import br.com.connectrescuedanimal.demo.service.ProtectressService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/protectress")
class ProtectressController(private val service: ProtectressService) {

    @PostMapping
    fun register(@RequestBody dtoProtectress: ProtectressRegisterDTO): ProtectressRegisterDTO {
        return service.register(dtoProtectress)
    }
}