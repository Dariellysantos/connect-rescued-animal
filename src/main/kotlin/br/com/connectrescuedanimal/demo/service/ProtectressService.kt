package br.com.connectrescuedanimal.demo.service

import br.com.connectrescuedanimal.demo.dto.ProtectressRegisterDto
import br.com.connectrescuedanimal.demo.model.Protectress
import org.springframework.stereotype.Service

@Service
class ProtectressService(
    private var protective: List<Protectress> = ArrayList()
) {

    fun register(dtoProtectress: ProtectressRegisterDto): ProtectressRegisterDto {
        protective.plus(
            Protectress(
                id = dtoProtectress.id,
                name = dtoProtectress.name,
                address = dtoProtectress.address,
                cpf = dtoProtectress.cpf,
                historic = null,
                description = dtoProtectress.description,
                email = dtoProtectress.email
            )
        )
        return dtoProtectress
    }

}