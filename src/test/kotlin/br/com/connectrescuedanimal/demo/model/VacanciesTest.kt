package br.com.connectrescuedanimal.demo.model

import java.time.LocalDate

object VacanciesTest {
    fun build() = Vacancies(
        id = 1,
        typeAnimal = "gato",
        quantity = 9,
        nonprofitOrganizationId = 5,
        creationDate = LocalDate.now()
    )

}