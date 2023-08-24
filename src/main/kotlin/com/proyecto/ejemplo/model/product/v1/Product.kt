package com.proyecto.ejemplo.model.product.v1

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

//Modelado DB
@Entity
@Table(name = "products")
data class Product (
    @Id
    val idProduct : Int,
    @Column
    val nameProduct : String,
    @Column
    val skuProduct : Int,
    @Column
    val priceProduct: Long
)
