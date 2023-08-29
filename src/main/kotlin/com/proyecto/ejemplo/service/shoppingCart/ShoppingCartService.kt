package com.proyecto.ejemplo.service.shoppingCart

import com.proyecto.ejemplo.dto.shoppingCart.v1.ShoppingCartDto
import com.proyecto.ejemplo.dto.shoppingCart.v1.ShoppingCartRequest

interface ShoppingCartService {
    fun createShoppingCart(shoppingCartRequest: ShoppingCartRequest): ShoppingCartDto
}