package com.proyecto.ejemplo.service.shoppingCart

import com.proyecto.ejemplo.dto.product.v1.ProductDto
import com.proyecto.ejemplo.dto.productInCart.v1.ProductInCartDto
import com.proyecto.ejemplo.dto.shoppingCart.v1.ShoppingCartDto
import com.proyecto.ejemplo.dto.shoppingCart.v1.ShoppingCartRequest
import com.proyecto.ejemplo.model.productInCar.v1.ProductInCart
import java.util.*

interface ShoppingCartService {
    fun createShoppingCart(shoppingCartRequest: ShoppingCartRequest): ShoppingCartDto
    fun getAllProductsInCart(cartId: UUID): ShoppingCartDto
}