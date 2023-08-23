package com.proyecto.ejemplo.service

import com.proyecto.ejemplo.dto.ProductsInCartDto


interface ProductService {

    fun addProductToCart(
        cartId: Int,
        productId: Int,
        quantity: Int
    )

    fun getProductsInCart(
        cartId: Int
    ) : List<ProductsInCartDto>
}