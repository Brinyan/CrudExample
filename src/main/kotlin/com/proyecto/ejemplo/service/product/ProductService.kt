package com.proyecto.ejemplo.service.product

import com.proyecto.ejemplo.dto.product.v1.ProductDto
import com.proyecto.ejemplo.dto.product.v1.ProductRequest
import com.proyecto.ejemplo.dto.productInCart.v1.ProductInCartDto
import com.proyecto.ejemplo.model.product.v1.Product
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.domain.Specification
import java.util.UUID


interface ProductService {
    fun addProductToCart(cartId: UUID, productId: UUID, quantity: Int, idShop : Int, totalCost : Long)
    fun getProductsInCart(cartId: UUID) : List<ProductInCartDto>
    fun createProduct(productRequest: ProductRequest): ProductDto
    fun getProductById(productId: UUID): ProductDto
    fun getAllProducts(pageable: Pageable): Page<ProductDto>
}