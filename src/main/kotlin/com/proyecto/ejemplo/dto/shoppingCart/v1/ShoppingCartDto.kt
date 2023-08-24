package com.proyecto.ejemplo.dto.shoppingCart.v1

import java.time.LocalDateTime
import java.util.UUID

class ShoppingCartDto(
    val idCart: UUID,
    val dateCreation: LocalDateTime
)