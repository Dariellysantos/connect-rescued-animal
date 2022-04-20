package br.com.connectrescuedanimal.demo.repository

import br.com.connectrescuedanimal.demo.model.Animal
import org.springframework.data.jpa.repository.JpaRepository

interface AnimalsRepository : JpaRepository<Animal, Long> {
}