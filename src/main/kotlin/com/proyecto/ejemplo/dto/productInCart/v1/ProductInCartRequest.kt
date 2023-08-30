package com.proyecto.ejemplo.dto.productInCart.v1

import com.proyecto.ejemplo.dto.product.v1.ProductDto
import com.proyecto.ejemplo.dto.product.v1.ProductRequest
import com.proyecto.ejemplo.dto.shoppingCart.v1.ShoppingCartDto
import com.proyecto.ejemplo.model.product.v1.Product
import com.proyecto.ejemplo.model.shoppingCart.v1.ShoppingCart
import java.util.UUID

class ProductInCartRequest (
        val idCart : UUID,
        val productId: UUID,
        var quantity : Int
)