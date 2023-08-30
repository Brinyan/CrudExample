package com.proyecto.ejemplo.controller.productInCart.v1

import com.proyecto.ejemplo.dto.productInCart.v1.ProductInCartDto
import com.proyecto.ejemplo.dto.productInCart.v1.ProductInCartRequest
import com.proyecto.ejemplo.dto.shoppingCart.v1.ShoppingCartDto
import com.proyecto.ejemplo.service.product.ProductService
import com.proyecto.ejemplo.service.productInCart.ProductInCartService
import com.proyecto.ejemplo.service.shoppingCart.ShoppingCartService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*
import kotlin.system.exitProcess

@RestController
@RequestMapping("/v1/productInCart")
class ProductInCartController (
    private val productInCartService: ProductInCartService
){
    @PostMapping("addProduct")
    fun addProductToCart(
        @RequestBody productInCartRequest: ProductInCartRequest
    ): ResponseEntity<ProductInCartDto> {
        val updatedCart = productInCartService.addProductToCart(productInCartRequest)
        return ResponseEntity.ok(updatedCart)
    }

    @PostMapping("deleteProduct")
    fun deleteProductInCart(
            @RequestBody productInCartRequest: ProductInCartRequest
    ) : ResponseEntity<HttpStatus> {
        productInCartService.deleteProductInCart(productInCartRequest)
        return ResponseEntity.ok(HttpStatus.ACCEPTED)
    }

    @PatchMapping("/updateProductQuantity")
    fun updateProductQuantity(
            @RequestBody productInCartRequest: ProductInCartRequest,
    ): ResponseEntity<ProductInCartDto> {
        val updatedProductInCart = productInCartService.updateProductQuantity(productInCartRequest)
        return ResponseEntity.ok(updatedProductInCart)
    }

}