package br.com.connectrescuedanimal.demo.repository

import br.com.connectrescuedanimal.demo.model.Vacancies
import org.springframework.data.jpa.repository.JpaRepository

interface VacanciesRepository : JpaRepository<Vacancies, Long> {
    fun findByTypeAnimal(typeAnimal: String): List<Vacancies>
}
