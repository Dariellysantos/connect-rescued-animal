package br.com.connectrescuedanimal.demo.service

import br.com.connectrescuedanimal.demo.dto.AnimalsDto
import br.com.connectrescuedanimal.demo.mapper.AnimalsFormMapper
import org.springframework.stereotype.Service

@Service
class AnimalsService(
    private var animals: List<AnimalsDto> = ArrayList(),
    private val animalsFormMapper: AnimalsFormMapper


) {
    fun register(dtoAnimals: AnimalsDto): AnimalsDto {
        animals.plus(
            animalsFormMapper.map(dtoAnimals)
        )
        return dtoAnimals

    }

}
