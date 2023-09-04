package com.proyecto.ejemplo.repositories

import com.proyecto.ejemplo.dto.productInCart.v1.ProductInCartDto
import com.proyecto.ejemplo.model.productInCar.v1.ProductInCart
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.Optional
import java.util.UUID

@Repository
interface ProductInCartRepository : JpaRepository<ProductInCart,UUID> {
    fun findByProductIdProductAndShoppingCartIdCart(idProduct : UUID, idCart : UUID) : Optional<ProductInCart>
}