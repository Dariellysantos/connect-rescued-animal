package br.com.connectrescuedanimal.demo.controller

import br.com.connectrescuedanimal.demo.dto.ProtectressRegisterDto
import br.com.connectrescuedanimal.demo.model.Protectress
import br.com.connectrescuedanimal.demo.service.ProtectressService
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
@RequestMapping("/protectress")
class ProtectressController(private val service: ProtectressService) {

    @Transactional
    @PostMapping
    fun register(@RequestBody @Valid dtoProtectress: ProtectressRegisterDto): Protectress {
        return service.register(dtoProtectress)
    }
}