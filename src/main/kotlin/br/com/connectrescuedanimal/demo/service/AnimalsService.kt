package br.com.connectrescuedanimal.demo.service

import br.com.connectrescuedanimal.demo.dto.AnimalsDto
import br.com.connectrescuedanimal.demo.mapper.AnimalsFormMapper
import br.com.connectrescuedanimal.demo.model.Animal
import br.com.connectrescuedanimal.demo.repository.AnimalsRepository
import org.springframework.stereotype.Service

@Service
class AnimalsService(
    private var animals: List<Animal> = listOf(),
    private val animalsFormMapper: AnimalsFormMapper,
    private val repository: AnimalsRepository


) {
    fun register(dtoAnimals: AnimalsDto): Animal {
        var animalsMapper = animalsFormMapper.map(dtoAnimals)
        var saveAnimal = repository.save(animalsMapper)
        return saveAnimal

    }

    fun getById(id: Long): Animal {
        return repository.getById(id)
    }
}
