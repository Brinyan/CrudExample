package com.proyecto.ejemplo.dto.product.v1

import java.util.UUID

class ProductRequest (
    val idProduct: UUID,
    val nameProduct: String,
    val skuProduct: Int,
    val priceProduct: Long
)