package br.com.connectrescuedanimal.demo.mapper

import br.com.connectrescuedanimal.demo.dto.AnimalsDto
import br.com.connectrescuedanimal.demo.model.Animal
import org.springframework.stereotype.Component

@Component
class AnimalsFormMapper : Mapper<AnimalsDto, Animal> {
    override fun map(t: AnimalsDto): Animal {
        return Animal(
            id = t.id,
            genre = t.genre,
            breed = t.breed,
            type = t.type,
            status = t.status,
            protectress = t.protectress
        )
    }

}
