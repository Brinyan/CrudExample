package com.proyecto.ejemplo.service.product.impl


import com.proyecto.ejemplo.dto.product.v1.ProductDto
import com.proyecto.ejemplo.dto.product.v1.ProductMapper
import com.proyecto.ejemplo.dto.product.v1.ProductRequest
import com.proyecto.ejemplo.dto.product.v1.ProductUpdateRequest
import com.proyecto.ejemplo.model.product.v1.Product
import com.proyecto.ejemplo.repositories.ProductRepository
import com.proyecto.ejemplo.service.product.ProductService
import org.springframework.data.domain.Page
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException
import java.util.UUID
import org.springframework.data.domain.Pageable


@Service
class ProductServiceImplement (
    private val productRepository: ProductRepository,
    private val productMapper: ProductMapper
    ) : ProductService {
    override fun createProduct(productRequest : ProductRequest): ProductDto {
        val product = productMapper.toEntity(productRequest)
        val savedProduct = productRepository.save(product)
        return productMapper.toDto(savedProduct)
    }

    override fun getProductById(productId: UUID): ProductDto {
        val product = productRepository.findById(productId).orElseThrow{ throw ResponseStatusException(HttpStatus.NOT_FOUND)}
        return productMapper.toDto(product)
    }

    override fun getAllProducts(pageable: Pageable): Page<ProductDto> {
        val productsPage: Page<Product> = productRepository.findAll(pageable)
        return productsPage.map { productMapper.toDto(it) }
    }

    override fun updateProduct(idProduct: UUID, productUpdateRequest: ProductUpdateRequest): ProductDto {
//ACTULIZAR NOMBRE Y SKU

        val optionalProduct = productRepository.findById(idProduct)

        if (optionalProduct.isPresent) {
            val producto = optionalProduct.get()
            productMapper.updateProduct(productUpdateRequest,producto)
            val saveChangesProduct = productRepository.save(producto)
            return productMapper.toDto(saveChangesProduct)
        } else {
            throw ResponseStatusException(HttpStatus.NOT_FOUND, "Producto no encontrado.")
        }
    }
}
