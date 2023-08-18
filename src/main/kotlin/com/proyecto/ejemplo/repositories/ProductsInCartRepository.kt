package com.proyecto.ejemplo.repositories

import com.proyecto.ejemplo.model.ProductsInCar
import org.springframework.data.repository.CrudRepository

interface ProductsInCartRepository : CrudRepository<ProductsInCar,Int> {
}