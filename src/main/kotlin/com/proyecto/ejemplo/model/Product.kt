package com.proyecto.ejemplo.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

//Modelado DB
@Entity
@Table(name = "product")
data class Product (
    @Id
    @GeneratedValue
    val idProduct : Int = 0,
    @Column
    val nameProduct : String = "",
    @Column
    val skuProduct : Int = 0,
    @Column
    val priceProduct: Long = 0
)
