package br.com.hallisonoliveira.appdev.exercicio3.model

fun ShoppingRemote.toDomain() : Shopping {
    return Shopping(
        id = id,
        name = name,
        amount = amount,
        brand = brand,
        shelfLife = shelfLife
    )
}