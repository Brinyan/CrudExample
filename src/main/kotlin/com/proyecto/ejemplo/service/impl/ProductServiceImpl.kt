package com.proyecto.ejemplo.service.impl

import com.proyecto.ejemplo.repositories.ProductRepository
import com.proyecto.ejemplo.repositories.ProductsInCartRepository
import com.proyecto.ejemplo.repositories.ShoppingCartRepository

class ProductServiceImpl(
    private val shoppingCartRepository : ShoppingCartRepository,
    private val productRepository: ProductRepository,
    private val productsInCartRepository: ProductsInCartRepository
) {
}