package com.proyecto.ejemplo.repositories

import com.proyecto.ejemplo.model.ShoppingCart
import org.springframework.data.repository.CrudRepository

interface ShoppingCartRepository : CrudRepository<ShoppingCart, Int>{
}