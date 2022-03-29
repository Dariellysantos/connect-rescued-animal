package br.com.connectrescuedanimal.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/root")
class RootController {
    @GetMapping
    fun welcome(): String {
        return "Bem vindo! \n Está ajudando um animalzinho abandonado? \n Vamos te ajudar!"
    }
}