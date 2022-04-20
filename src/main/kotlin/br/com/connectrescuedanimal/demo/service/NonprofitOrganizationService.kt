package br.com.connectrescuedanimal.demo.service

import br.com.connectrescuedanimal.demo.dto.NonprofitOrganizationDto
import br.com.connectrescuedanimal.demo.mapper.NonprofitOrganizationFormMapper
import br.com.connectrescuedanimal.demo.model.NonprofitOrganization
import br.com.connectrescuedanimal.demo.repository.NonprofitOrganizationRepository
import org.springframework.stereotype.Service

@Service
class NonprofitOrganizationService(
    private val repository: NonprofitOrganizationRepository,
    private val nonprofitOrganizationFormMapper: NonprofitOrganizationFormMapper

) {
    fun register(dtoNonprofitOrganization: NonprofitOrganizationDto): NonprofitOrganization {

        val nonprofitOrganizationMapper = nonprofitOrganizationFormMapper.map(dtoNonprofitOrganization)
        repository.save(nonprofitOrganizationMapper)
        return nonprofitOrganizationMapper

    }
}