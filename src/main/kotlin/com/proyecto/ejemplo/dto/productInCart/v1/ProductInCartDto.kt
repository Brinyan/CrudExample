package com.proyecto.ejemplo.dto.productInCart.v1

import com.proyecto.ejemplo.dto.shoppingCart.v1.ShoppingCartDto
import com.proyecto.ejemplo.dto.product.v1.ProductDto

class ProductInCartDto (
    val idShop : Int? = null,
    val shoppingCart: ShoppingCartDto,
    val totalCost : Int? = null,
    val product: ProductDto,
    val totalProduct: Int? = null
)