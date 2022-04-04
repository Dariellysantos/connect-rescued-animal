package br.com.connectrescuedanimal.demo.service

import br.com.connectrescuedanimal.demo.dto.NonprofitOrganizationDto
import br.com.connectrescuedanimal.demo.mapper.NonprofitOrganizationFormMapper
import br.com.connectrescuedanimal.demo.model.NonprofitOrganization
import org.springframework.stereotype.Service

@Service
class NonprofitOrganizationService(
    private var nonprofitOrganization: List<NonprofitOrganization> = ArrayList(),
    private val nonprofitOrganizationFormMapper: NonprofitOrganizationFormMapper

) {
    fun register(dtoNonprofitOrganization: NonprofitOrganizationDto): NonprofitOrganizationDto {
        nonprofitOrganization.plus(
            nonprofitOrganizationFormMapper.map(dtoNonprofitOrganization)
        )
        return dtoNonprofitOrganization

    }
}