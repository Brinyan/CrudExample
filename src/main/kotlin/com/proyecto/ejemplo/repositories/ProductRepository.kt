package com.proyecto.ejemplo.repositories

import com.proyecto.ejemplo.model.Product
import org.springframework.data.repository.CrudRepository

//Conexión de DB
interface ProductRepository : CrudRepository<Product, Int> {
}