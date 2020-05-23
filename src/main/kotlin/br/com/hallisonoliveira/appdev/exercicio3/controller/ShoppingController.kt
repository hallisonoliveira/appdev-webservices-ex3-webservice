package br.com.hallisonoliveira.appdev.exercicio3.controller

import br.com.hallisonoliveira.appdev.exercicio3.model.Shopping
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class ShoppingController {

//    @GetMapping("shopping/")
//    fun getAll() : ResponseEntity<List<Shopping>> {
//
//    }




}

/*

#@app.route("/compras",methods=["GET"]) returna toda a lista de compras
#@app.route("/compras",methods=["POST"]) cria um novo item na lista de compras
#@app.route("/compras/<int:id>",methods=["GET"]) retorna o item com o id
#@app.route("/compras/<int:id>",methods=["PATCH"]) SUBSTITUI parcialmente item ou cria um novo
#@app.route("/compras/<int:id>",methods=["PUT"]) SUBSTITUI o item ou cria um novo
#@app.route("/compras/<int:id>",methods=["DELETE"]) remove o item

 */