package com.proyecto.ejemplo.dto.shoppingCart.v1

import com.proyecto.ejemplo.dto.productInCart.v1.ProductInCartDto
import com.proyecto.ejemplo.model.productInCar.v1.ProductInCart
import jakarta.persistence.Column
import java.time.LocalDateTime
import java.util.UUID

class ShoppingCartDto(
        val idCart: UUID,
        val dateCreation : LocalDateTime = LocalDateTime.now(),
        val products: MutableList<ProductInCartDto>,

){
    var totalProduct: Int? = null
    var totalPriceCart: Long? = null
}