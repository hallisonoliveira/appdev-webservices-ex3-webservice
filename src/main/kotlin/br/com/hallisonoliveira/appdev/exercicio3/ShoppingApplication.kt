package br.com.hallisonoliveira.appdev.exercicio3

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
//@EnableAutoConfiguration(exclude = [MongoAutoConfiguration::class])
class ShoppingApplication

fun main(args: Array<String>) {
	runApplication<ShoppingApplication>(*args)
}
