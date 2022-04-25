package br.com.connectrescuedanimal.demo.repository

import br.com.connectrescuedanimal.demo.model.Protectress
import org.springframework.data.jpa.repository.JpaRepository

interface ProtectressRepository : JpaRepository<Protectress, Long> {
}