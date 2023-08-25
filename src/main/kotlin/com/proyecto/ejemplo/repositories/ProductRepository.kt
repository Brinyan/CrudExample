package com.proyecto.ejemplo.repositories

import com.proyecto.ejemplo.model.product.v1.Product
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface ProductRepository : JpaRepository<Product, UUID> {
}