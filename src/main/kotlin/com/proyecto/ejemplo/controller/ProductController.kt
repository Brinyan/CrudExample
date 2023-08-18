package com.proyecto.ejemplo.controller

import com.proyecto.ejemplo.model.Product
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import com.proyecto.ejemplo.repositories.ProductRepository
import org.springframework.beans.factory.annotation.Autowired

@RestController
class ProductController(@Autowired private val productRepository: ProductRepository) {

    @PostMapping("/createProduct")
    fun createProduct(@RequestBody product: Product): ResponseEntity<Product> {
        val createdProduct = productRepository.save(product)
        return ResponseEntity(createdProduct, HttpStatus.CREATED)
    }

    @GetMapping("/getProductById/{id}")
    fun getProductById(@PathVariable("id") productId: Int): ResponseEntity<Product> {
        val product = productRepository.findById(productId).orElse(null)
        return if (product != null) ResponseEntity(product, HttpStatus.OK)
        else ResponseEntity(HttpStatus.NOT_FOUND)
    }

    @GetMapping("/getAllProducts")
    fun getAllProducts(): List<Product> =
        productRepository.findAll().toList()

    @PutMapping("/updateProduct/{id}")
    fun updateProductById(@PathVariable("id") productId: Int, @RequestBody product: Product): ResponseEntity<Product> {

        val existingProduct = productRepository.findById(productId).orElse(null)
            ?: return ResponseEntity(HttpStatus.NOT_FOUND)

        val updatedProduct = existingProduct.copy(idProduct = product.idProduct, nameProduct = product.nameProduct, skuProduct =  product.skuProduct, priceProduct = product.priceProduct )
        productRepository.save(updatedProduct)
        return ResponseEntity(updatedProduct, HttpStatus.OK)
    }

    @DeleteMapping("deleteProduct/{id}")
    fun deleteProductById(@PathVariable("id") productId: Int): ResponseEntity<Product> {
        if (!productRepository.existsById(productId)) {
            return ResponseEntity(HttpStatus.NOT_FOUND)
        }
        productRepository.deleteById(productId)
        return ResponseEntity(HttpStatus.NO_CONTENT)
    }

}