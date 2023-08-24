package com.proyecto.ejemplo.repositories

import com.proyecto.ejemplo.model.product.v1.Product
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ProductRepository : CrudRepository<Product, Int> {
}