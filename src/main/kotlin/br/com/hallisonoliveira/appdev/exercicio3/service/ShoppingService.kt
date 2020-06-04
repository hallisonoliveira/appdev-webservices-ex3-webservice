package br.com.hallisonoliveira.appdev.exercicio3.service

import br.com.hallisonoliveira.appdev.exercicio3.model.Shopping
import br.com.hallisonoliveira.appdev.exercicio3.model.ShoppingRemote
import br.com.hallisonoliveira.appdev.exercicio3.model.toDomain
import br.com.hallisonoliveira.appdev.exercicio3.repository.ShoppingRepository
import org.springframework.stereotype.Service

@Service
class ShoppingService(
    private val repository: ShoppingRepository
) {

    fun save(shopping: Shopping) : Shopping{
        return repository.save(shopping)
    }

    fun getById(id: String) : Shopping = repository.findById(id).get()

    fun list() : List<Shopping> = repository.findAll()

    fun delete(id: String) {
        repository.deleteById(id)
    }

    fun add(shopping: ShoppingRemote) {
        repository.save(
                shopping.copy(id = System.currentTimeMillis().toString()
            ).toDomain())
    }
}