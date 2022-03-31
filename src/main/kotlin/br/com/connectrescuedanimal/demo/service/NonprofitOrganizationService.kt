package br.com.connectrescuedanimal.demo.service

import br.com.connectrescuedanimal.demo.dto.NonprofitOrganizationDto
import br.com.connectrescuedanimal.demo.model.NonprofitOrganization
import org.springframework.stereotype.Service

@Service
class NonprofitOrganizationService(
    private var nonprofitOrganization: List<NonprofitOrganization> = ArrayList()
) {
    fun register(dtoNonprofitOrganization: NonprofitOrganizationDto): NonprofitOrganizationDto {
        nonprofitOrganization.plus(
            NonprofitOrganization(
                id = dtoNonprofitOrganization.id,
                cnpj = dtoNonprofitOrganization.cnpj,
                numberOfVacancies = dtoNonprofitOrganization.numberOfVacancies,
                address = dtoNonprofitOrganization.address,
                linkPage = dtoNonprofitOrganization.linkPage
            )
        )
        return dtoNonprofitOrganization

    }
}