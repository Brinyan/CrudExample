package com.proyecto.ejemplo.repositories

import com.proyecto.ejemplo.model.ProductsInCart
import org.springframework.data.repository.CrudRepository

interface ProductsInCartRepository : CrudRepository<ProductsInCart,Int> {
    fun findByShoppingCart_Id(shoppingCartId: Int): List<ProductsInCart>
}