package br.com.hallisonoliveira.appdev.exercicio3.controller

import br.com.hallisonoliveira.appdev.exercicio3.model.Shopping
import br.com.hallisonoliveira.appdev.exercicio3.model.ShoppingRemote
import br.com.hallisonoliveira.appdev.exercicio3.service.ShoppingService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.lang.Exception

@RestController
@RequestMapping("/api")
class ShoppingController(
    private val service: ShoppingService
) {

    @GetMapping("/shopping")
    fun list() : ResponseEntity<List<Shopping>> {
        val response = service.list()
        return ResponseEntity.ok(response)
    }

    @PostMapping("/shopping")
    fun add(
        @RequestBody shopping: ShoppingRemote) {
        service.add(shopping)
    }

    @GetMapping("/shopping/{id}")
    fun getById(
            @PathVariable id: String
    ) : ResponseEntity<Shopping> {
        try {
            val response = service.getById(id)
            return ResponseEntity.ok(response)
        } catch (noSuchElement: NoSuchElementException) {
            return ResponseEntity(HttpStatus.NO_CONTENT)
        } catch (exception: Exception) {
            return ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR)
        }
    }

    @PatchMapping("/shopping")
    fun patch(
        @RequestBody shopping: Shopping
    ) {
        service.save(shopping)
    }

    @PutMapping("/shopping")
    fun put(
        @RequestBody shopping: Shopping
    ) : ResponseEntity<Shopping> {
        val shopping = service.save(shopping)
        return ResponseEntity.ok(shopping)
    }

    @DeleteMapping("/shopping/{id}")
    fun delete(
        @PathVariable id: String
    ) {
        service.delete(id)
    }

}
