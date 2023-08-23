package com.proyecto.ejemplo.dto

import com.proyecto.ejemplo.model.Product
import com.proyecto.ejemplo.model.ShoppingCart

class ProductsInCartDto (
    val idShop : Int? = null,
    val shoppingCart: ShoppingCartDto,
    val totalCost : Int? = null,
    val product: ProductDto,
    val totalProduct: Int? = null
)