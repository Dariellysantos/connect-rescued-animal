package br.com.connectrescuedanimal.demo.service

import br.com.connectrescuedanimal.demo.dto.ProtectressRegisterDto
import br.com.connectrescuedanimal.demo.mapper.ProtectiveFormMapper
import br.com.connectrescuedanimal.demo.model.Protectress
import org.springframework.stereotype.Service

@Service
class ProtectressService(
    private var protective: List<Protectress> = listOf(),
    private val protectiveFormMapper: ProtectiveFormMapper
) {

    fun register(dtoProtectress: ProtectressRegisterDto): Protectress {
        var protectiveMapper = protectiveFormMapper.map(dtoProtectress)
        protectiveMapper.id = protective.size.toLong() + 1


        protective = protective.plus(
            protectiveMapper
        )
        return protectiveMapper
    }

}