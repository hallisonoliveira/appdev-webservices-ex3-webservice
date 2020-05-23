package br.com.hallisonoliveira.appdev.exercicio3.controller

import br.com.hallisonoliveira.appdev.exercicio3.model.Shopping
import br.com.hallisonoliveira.appdev.exercicio3.service.ShoppingService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

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
        @RequestBody shopping: Shopping) {
        service.add(shopping)
    }

    @GetMapping("/shopping/{id}")
    fun getById(
            @PathVariable id: String
    ) : ResponseEntity<Shopping> {
        val response = service.getById(id)
        return ResponseEntity.ok(response)
    }

    @PatchMapping("/shopping")
    fun patch(
        @RequestBody shopping: Shopping
    ) {
        service.add(shopping)
    }

    @PutMapping("/shopping")
    fun put(
        @RequestBody shopping: Shopping
    ) : ResponseEntity<Shopping> {
        val shopping = service.add(shopping)
        return ResponseEntity.ok(shopping)
    }

    @DeleteMapping("/shopping/{id}")
    fun delete(
        @PathVariable id: String
    ) {
        service.delete(id)
    }

}
