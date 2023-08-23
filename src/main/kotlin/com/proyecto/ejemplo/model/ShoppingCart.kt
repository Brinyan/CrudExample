package com.proyecto.ejemplo.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.time.LocalDateTime

@Entity
@Table(name = "shoppingCart")

data class ShoppingCart(
    @Id
    @GeneratedValue
    val idCart: Int = 0,
    @Column
    val dateCreation: LocalDateTime = LocalDateTime.now()
)