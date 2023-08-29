package com.proyecto.ejemplo.dto.productInCart.v1

import com.proyecto.ejemplo.dto.shoppingCart.v1.ShoppingCartDto
import com.proyecto.ejemplo.dto.product.v1.ProductDto
import com.proyecto.ejemplo.dto.product.v1.ProductRequest
import com.proyecto.ejemplo.model.product.v1.Product
import com.proyecto.ejemplo.model.shoppingCart.v1.ShoppingCart
import jakarta.persistence.Column


class ProductInCartDto (
    val shoppingCart: ShoppingCartDto,
    val product: ProductDto,
    val quantity : Int

    /*val Product
    val totalCost : Long,
    val totalProduct: Int,
    val quantity: Int*/
)
