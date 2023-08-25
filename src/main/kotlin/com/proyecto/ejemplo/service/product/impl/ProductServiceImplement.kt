package com.proyecto.ejemplo.service.product.impl


import com.proyecto.ejemplo.dto.product.v1.ProductDto
import com.proyecto.ejemplo.dto.product.v1.ProductMapper
import com.proyecto.ejemplo.dto.product.v1.ProductRequest
import com.proyecto.ejemplo.dto.productInCart.v1.ProductInCartMapper
import com.proyecto.ejemplo.dto.productInCart.v1.ProductInCartDto
import com.proyecto.ejemplo.model.product.v1.Product
import com.proyecto.ejemplo.model.productInCar.v1.ProductInCart
import com.proyecto.ejemplo.repositories.ProductRepository
import com.proyecto.ejemplo.repositories.ProductInCartRepository
import com.proyecto.ejemplo.repositories.ShoppingCartRepository
import com.proyecto.ejemplo.service.product.ProductService
import org.springframework.data.domain.Page
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException
import java.util.UUID
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.domain.Specification

@Service
class ProductServiceImplement (
    private val shoppingCartRepository : ShoppingCartRepository,
    private val productRepository: ProductRepository,
    private val productsInCartRepository: ProductInCartRepository,
    private val productInCartMapper: ProductInCartMapper,
    private val productMapper: ProductMapper
    ) : ProductService {

    override fun addProductToCart(cartId: UUID, productId: UUID, quantity: Int, idShop : Int, totalCost : Long) {
        val shoppingCart = shoppingCartRepository.findById(cartId)
        val product = productRepository.findById(productId)

        if (shoppingCart.isPresent && product.isPresent) {
            val productInCart =
                ProductInCart(shoppingCart = shoppingCart.get(), product = product.get(), totalProduct = quantity, idShop = idShop, totalCost = totalCost)
            productsInCartRepository.save(productInCart)
        }
    }

    override fun getProductsInCart(cartId: UUID): List<ProductInCartDto> {
        val cart = shoppingCartRepository.findById(cartId)
        val productInCart = productsInCartRepository.findByShoppingCartIdCart(cartId)

        return if (cart.isPresent) {
            productInCart.map { productInCart -> productInCartMapper.toDto(productInCart)
            }
        } else {
            emptyList()
        }
    }

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


    /*

    override fun getAllProducts(page: Int, size: Int): Page<ProductDto> {
        val pageable: Pageable = PageRequest.of(page, size)
        val productsPage: Page<Product> = productRepository.findAll(pageable)
        return productsPage.map { productMapper.toDto(it) }
    }

    productRepository.findAll().map { productMapper.toDto(it)

    @GetMapping("/getProductById/{id}")
    fun getProductById(@PathVariable("id") productId: Int): ResponseEntity<Product> {
        val product = productRepository.findById(productId).orElse(null)
        return if (product != null) ResponseEntity(product, HttpStatus.OK)
        else ResponseEntity(HttpStatus.NOT_FOUND)
    }
     */


}
