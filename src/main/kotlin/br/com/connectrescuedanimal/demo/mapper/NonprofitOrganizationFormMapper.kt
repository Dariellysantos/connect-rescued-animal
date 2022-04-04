package br.com.connectrescuedanimal.demo.mapper

import br.com.connectrescuedanimal.demo.dto.NonprofitOrganizationDto
import br.com.connectrescuedanimal.demo.model.NonprofitOrganization
import org.springframework.stereotype.Component

@Component
class NonprofitOrganizationFormMapper : Mapper<NonprofitOrganizationDto, NonprofitOrganization> {
    override fun map(t: NonprofitOrganizationDto): NonprofitOrganization {
        return NonprofitOrganization(
            id = t.id,
            cnpj = t.cnpj,
            numberOfVacancies = t.numberOfVacancies,
            address = t.address,
            linkPage = t.linkPage
        )
    }
}