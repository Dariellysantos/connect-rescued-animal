package br.com.connectrescuedanimal.demo.mapper

import br.com.connectrescuedanimal.demo.dto.ProtectressRegisterDto
import br.com.connectrescuedanimal.demo.model.Protectress
import org.springframework.stereotype.Component

@Component
class ProtectiveFormMapper : Mapper<ProtectressRegisterDto, Protectress> {
    override fun map(t: ProtectressRegisterDto): Protectress {
        return Protectress(
            id = t.id,
            name = t.name,
            address = t.address,
            cpf = t.cpf,
            description = t.description,
            email = t.email
        )
    }
}
