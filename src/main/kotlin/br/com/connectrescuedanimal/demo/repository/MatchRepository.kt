package br.com.connectrescuedanimal.demo.repository

import br.com.connectrescuedanimal.demo.model.Match
import org.springframework.data.jpa.repository.JpaRepository

interface MatchRepository : JpaRepository<Match, Long> {
}