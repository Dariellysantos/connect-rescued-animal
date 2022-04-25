package br.com.connectrescuedanimal.demo.repository

import br.com.connectrescuedanimal.demo.dto.VacanciesQuantityDto
import br.com.connectrescuedanimal.demo.model.Vacancies
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface VacanciesRepository : JpaRepository<Vacancies, Long> {
    fun findByTypeAnimal(typeAnimal: String): List<Vacancies>

    @Query("SELECT new br.com.connectrescuedanimal.demo.dto.VacanciesQuantityDto(t.nonprofitOrganizationId, count(t)) FROM Vacancies t GROUP BY t.nonprofitOrganizationId")
    fun report(): List<VacanciesQuantityDto>
}
