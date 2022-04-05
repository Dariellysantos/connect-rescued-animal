package br.com.connectrescuedanimal.demo.service

import br.com.connectrescuedanimal.demo.dto.AnimalsDto
import br.com.connectrescuedanimal.demo.mapper.AnimalsFormMapper
import br.com.connectrescuedanimal.demo.model.Animals
import org.springframework.stereotype.Service

@Service
class AnimalsService(
    private var animals: List<Animals> = listOf(),
    private val animalsFormMapper: AnimalsFormMapper


) {
    fun register(dtoAnimals: AnimalsDto): Animals {
        var animalsMapper = animalsFormMapper.map(dtoAnimals)
        animalsMapper.id = animals.size.toLong() + 1
        animals = animals.plus(
            animalsMapper
        )
        return animalsMapper

    }

}
