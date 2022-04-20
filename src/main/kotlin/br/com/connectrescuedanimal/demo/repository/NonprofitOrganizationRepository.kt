package br.com.connectrescuedanimal.demo.repository

import br.com.connectrescuedanimal.demo.model.NonprofitOrganization
import org.springframework.data.jpa.repository.JpaRepository

interface NonprofitOrganizationRepository : JpaRepository<NonprofitOrganization, Long> {
}