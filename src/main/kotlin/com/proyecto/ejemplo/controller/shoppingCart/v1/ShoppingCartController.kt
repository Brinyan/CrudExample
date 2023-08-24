package com.proyecto.ejemplo.controller.shoppingCart.v1


import com.proyecto.ejemplo.service.product.ProductService
import org.springframework.web.bind.annotation.*
import java.util.UUID

@RestController
@RequestMapping("/v1/shoppingCart")
class ShoppingCartController(private val productService: ProductService) {
   /* @PostMapping("/addProduct/{shoppingCartId}/{productId}/{totalProducts}")
    fun addProducts (
        @PathVariable shoppingCartId: UUID = UUID.randomUUID(),
        @PathVariable productId: Int,
        @PathVariable totalProducts: Int
        ) {
        productService.addProductToCart(shoppingCartId, productId, totalProducts)
*/
    }