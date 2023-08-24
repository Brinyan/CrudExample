package com.proyecto.ejemplo.service.product

import com.proyecto.ejemplo.dto.product.v1.ProductDto
import com.proyecto.ejemplo.dto.product.v1.ProductRequest
import com.proyecto.ejemplo.dto.productInCart.v1.ProductInCartDto
import java.util.UUID


interface ProductService {
    fun addProductToCart(cartId: UUID, productId: Int, quantity: Int)
    fun getProductsInCart(cartId: UUID) : List<ProductInCartDto>
    fun createProduct(productRequest: ProductRequest): ProductDto
}