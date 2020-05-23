package br.com.hallisonoliveira.appdev.exercicio3.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Shopping(
        @Id
        val id: String,
        val name: String,
        val amount: Int,
        val brand: String,
        val shelfLife: String
)