package br.com.connectrescuedanimal.demo.service

import br.com.connectrescuedanimal.demo.dto.ProtectressRegisterDto
import br.com.connectrescuedanimal.demo.mapper.ProtectiveFormMapper
import br.com.connectrescuedanimal.demo.model.Protectress
import br.com.connectrescuedanimal.demo.repository.ProtectressRepository
import org.springframework.stereotype.Service

@Service
class ProtectressService(
    private var repository: ProtectressRepository,
    private val protectiveFormMapper: ProtectiveFormMapper,
) {

    fun register(dtoProtectress: ProtectressRegisterDto): Protectress {
        val protectiveMapper = protectiveFormMapper.map(dtoProtectress)
        repository.save(protectiveMapper)
        return protectiveMapper
    }

}