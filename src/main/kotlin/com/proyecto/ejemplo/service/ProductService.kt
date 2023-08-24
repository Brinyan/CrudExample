package com.proyecto.ejemplo.service

import com.proyecto.ejemplo.dto.productInCart.v1.ProductInCartDto
import java.util.UUID


interface ProductService {

    fun addProductToCart(
        cartId: UUID,
        productId: Int,
        quantity: Int
    )

    fun getProductsInCart(
        cartId: UUID
    ) : List<ProductInCartDto>
}