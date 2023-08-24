package com.proyecto.ejemplo.repositories

import com.proyecto.ejemplo.model.shoppingCart.v1.ShoppingCart
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface ShoppingCartRepository : CrudRepository<ShoppingCart, UUID>{
}