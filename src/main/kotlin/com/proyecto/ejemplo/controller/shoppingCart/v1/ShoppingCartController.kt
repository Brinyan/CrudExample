package com.proyecto.ejemplo.controller.shoppingCart.v1


import com.proyecto.ejemplo.dto.shoppingCart.v1.ShoppingCartDto
import com.proyecto.ejemplo.dto.shoppingCart.v1.ShoppingCartRequest
import com.proyecto.ejemplo.service.product.ProductService
import com.proyecto.ejemplo.service.shoppingCart.ShoppingCartService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.net.URI
import java.util.UUID

@RestController
@RequestMapping("/v1/shoppingCart")
class ShoppingCartController(private val shoppingCartService: ShoppingCartService) {
    @PostMapping
    fun createShoppingCart(@RequestBody shoppingCartRequest: ShoppingCartRequest): ResponseEntity<ShoppingCartDto> {
        val createdCart = shoppingCartService.createShoppingCart(shoppingCartRequest)
        return ResponseEntity.created(URI("/v1/shoppingCart/${createdCart.idCart}")).body(createdCart)
    }
}