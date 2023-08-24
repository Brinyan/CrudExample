package com.proyecto.ejemplo.repositories

import com.proyecto.ejemplo.model.productInCar.v1.ProductInCart
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface ProductInCartRepository : CrudRepository<ProductInCart,UUID> {
    fun findByShoppingCartIdCart(shoppingCartId: UUID): List<ProductInCart>
}