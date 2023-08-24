package com.proyecto.ejemplo.model.shoppingCart.v1

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.time.LocalDateTime
import java.util.UUID

@Entity
@Table(name = "shopping_carts")

data class ShoppingCart(
    @Id
    val idCart: UUID = UUID.randomUUID(),
    @Column
    val dateCreation: LocalDateTime = LocalDateTime.now()
)