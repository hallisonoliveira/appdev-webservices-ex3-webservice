package br.com.hallisonoliveira.appdev.exercicio3.repository

import br.com.hallisonoliveira.appdev.exercicio3.model.Shopping
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface ShoppingRepository : MongoRepository<Shopping, String>