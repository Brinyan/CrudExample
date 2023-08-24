package com.proyecto.ejemplo.controller.shoppingCart.v1


import com.proyecto.ejemplo.dto.productInCart.v1.ProductInCartDto
import com.proyecto.ejemplo.service.ProductService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController
import java.util.UUID

@RestController
class ShoppingCartController(private val productService: ProductService) {
    @PostMapping("/addProduct/{shoppingCartId}/{productId}/{totalProducts}")
    fun addProducts (
        @PathVariable shoppingCartId: UUID = UUID.randomUUID(),
        @PathVariable productId: Int,
        @PathVariable totalProducts: Int
        ) {
        productService.addProductToCart(shoppingCartId, productId, totalProducts)
    }


}