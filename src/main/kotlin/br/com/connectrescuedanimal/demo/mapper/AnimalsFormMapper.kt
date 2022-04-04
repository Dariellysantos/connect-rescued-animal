package br.com.connectrescuedanimal.demo.mapper

import br.com.connectrescuedanimal.demo.dto.AnimalsDto
import br.com.connectrescuedanimal.demo.model.Animals
import org.springframework.stereotype.Component

@Component
class AnimalsFormMapper : Mapper<AnimalsDto, Animals> {
    override fun map(t: AnimalsDto): Animals {
        return Animals(
            id = t.id,
            genre = t.genre,
            breed = t.breed,
            type = t.type,
            status = t.status,
            protectress = t.protectress
        )
    }

}
