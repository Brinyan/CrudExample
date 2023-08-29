package com.proyecto.ejemplo.service.productInCart

import com.proyecto.ejemplo.dto.productInCart.v1.ProductInCartDto
import com.proyecto.ejemplo.dto.productInCart.v1.ProductInCartRequest
import com.proyecto.ejemplo.dto.shoppingCart.v1.ShoppingCartDto

import java.util.*

interface ProductInCartService {
    fun addProductToCart(productInCartRequest: ProductInCartRequest): ProductInCartDto
}