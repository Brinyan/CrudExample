package com.proyecto.ejemplo.controller.productInCart.v1

import com.proyecto.ejemplo.dto.productInCart.v1.ProductInCartDto
import com.proyecto.ejemplo.service.product.ProductService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping("/v1/productInCart")
class ProductInCartController (
    private val productService : ProductService
){
    @GetMapping("/getProductsInCart/{cartId}")
    fun getProductsInCart(
        @PathVariable cartId: UUID
    )
            : List<ProductInCartDto> {
        return productService.getProductsInCart(cartId)
    }

}