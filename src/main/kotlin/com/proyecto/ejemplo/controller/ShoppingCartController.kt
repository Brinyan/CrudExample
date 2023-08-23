package com.proyecto.ejemplo.controller


import com.proyecto.ejemplo.dto.ProductsInCartDto
import com.proyecto.ejemplo.service.ProductService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ShoppingCartController(private val productService: ProductService) {
    @PostMapping("/addProduct/{shoppingCartId}/{productId}/{totalProducts}")
    fun addProducts (
        @PathVariable shoppingCartId: Int,
        @PathVariable productId: Int,
        @PathVariable totalProducts: Int
        ) {
        productService.addProductToCart(shoppingCartId, productId, totalProducts)
    }

    @GetMapping("/getProductsInCart/{cartId}")
    fun getProductsInCart(
        @PathVariable cartId: Int)
            : List<ProductsInCartDto> {
        return productService.getProductsInCart(cartId)
    }
}