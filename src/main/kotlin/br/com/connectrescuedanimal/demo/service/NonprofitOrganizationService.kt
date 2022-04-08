package br.com.connectrescuedanimal.demo.service

import br.com.connectrescuedanimal.demo.dto.NonprofitOrganizationDto
import br.com.connectrescuedanimal.demo.mapper.NonprofitOrganizationFormMapper
import br.com.connectrescuedanimal.demo.model.NonprofitOrganization
import org.springframework.stereotype.Service

@Service
class NonprofitOrganizationService(
    private var nonprofitOrganization: List<NonprofitOrganization> = listOf(),
    private val nonprofitOrganizationFormMapper: NonprofitOrganizationFormMapper

) {
    fun register(dtoNonprofitOrganization: NonprofitOrganizationDto): NonprofitOrganization {

        val nonprofitOrganizationMapper = nonprofitOrganizationFormMapper.map(dtoNonprofitOrganization)
        nonprofitOrganizationMapper.id = nonprofitOrganization.size.toLong() + 1

        nonprofitOrganization = nonprofitOrganization.plus(
            nonprofitOrganizationMapper
        )
        return nonprofitOrganizationMapper

    }
}