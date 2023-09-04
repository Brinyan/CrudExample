package com.proyecto.ejemplo.controller.product.v1

import com.proyecto.ejemplo.dto.product.v1.ProductDto
import com.proyecto.ejemplo.dto.product.v1.ProductRequest
import com.proyecto.ejemplo.dto.product.v1.ProductUpdateRequest
import com.proyecto.ejemplo.dto.productInCart.v1.ProductInCartDto
import com.proyecto.ejemplo.dto.productInCart.v1.ProductInCartRequest
import com.proyecto.ejemplo.model.product.v1.Product
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import com.proyecto.ejemplo.service.product.ProductService
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.domain.Specification
import org.springframework.data.web.PageableDefault
import com.sipios.springsearch.anotation.SearchSpec
import java.util.*

/*
Crear producto
Actualizar producto
Obtener producto mediante uuid
Obtener productos
Eliminar producto
++Obtener producto mediante nombre
 */

@RestController
@RequestMapping("/v1/product")
class ProductController(
    private val productService: ProductService
) {

    @PostMapping("/create")
    fun createProduct(@RequestBody productRequest : ProductRequest): ResponseEntity<ProductDto> {
        val createdProduct = productService.createProduct(productRequest)
        return ResponseEntity(createdProduct, HttpStatus.CREATED)
    }

    @GetMapping("/getProductById/{productId}")
    fun getProductById(@PathVariable productId : UUID) : ResponseEntity<ProductDto>{
        return ResponseEntity.ok().body(productService.getProductById(productId))
    }

    @GetMapping("/getAllProducts")
    fun getAllProducts(
        @PageableDefault(page = 0, size = 10) pageable: Pageable
    ): ResponseEntity<Page<ProductDto>> {
        val productsPage = productService.getAllProducts(pageable)
        return ResponseEntity.ok(productsPage)
    }
    //ACTULIZAR NOMBRE Y SKU
    @PatchMapping("{idProduct}/updateProduct")
    fun updateProduct(
            @PathVariable idProduct : UUID,
            @RequestBody productUpdateRequest: ProductUpdateRequest,
    ): ResponseEntity<ProductDto> {
        val updatedProduct = productService.updateProduct(idProduct, productUpdateRequest)
        return ResponseEntity.ok(updatedProduct)
    }
}