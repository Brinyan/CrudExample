package com.proyecto.ejemplo.service.productInCart.impl

import com.proyecto.ejemplo.dto.productInCart.v1.ProductInCartDto
import com.proyecto.ejemplo.dto.productInCart.v1.ProductInCartMapper
import com.proyecto.ejemplo.dto.productInCart.v1.ProductInCartRequest
import com.proyecto.ejemplo.model.productInCar.v1.ProductInCart
import com.proyecto.ejemplo.repositories.ProductInCartRepository
import com.proyecto.ejemplo.repositories.ProductRepository
import com.proyecto.ejemplo.repositories.ShoppingCartRepository
import com.proyecto.ejemplo.service.productInCart.ProductInCartService
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException
import java.util.*


@Service
class ProductInCartServiceImpl (
    private val shoppingCartRepository: ShoppingCartRepository,
    private val productRepository: ProductRepository,
    private val productInCartRepository: ProductInCartRepository,
    private val productInCartMapper: ProductInCartMapper,

) : ProductInCartService {
    override fun addProductToCart(productInCartRequest: ProductInCartRequest): ProductInCartDto {
        val cartId = productInCartRequest.idCart
        val productId = productInCartRequest.productId
        val quantityP = productInCartRequest.quantity

        val cartI = shoppingCartRepository.findById(cartId).orElseThrow { throw ResponseStatusException(HttpStatus.NOT_FOUND, "Producto no encontrado" )}
        val productI = productRepository.findById(productId).orElseThrow { throw ResponseStatusException(HttpStatus.NOT_FOUND, "Carrito no encontrado") }
        val addProduct = productInCartMapper.toEntity(productInCartRequest)
        if (quantityP > 0) {
            addProduct.quantity = quantityP
        } else {
            throw ResponseStatusException(HttpStatus.BAD_REQUEST, "Cantidad no puede ser negativa")
        }

        var productExist: ProductInCart? = null

        for (productCart in cartI.products) {
            if (productCart.product == productI) {
                productExist = productCart
                break
            }
        }

        if (productExist == null) {

            addProduct.shoppingCart = cartI
            addProduct.product = productI

            val saveProductInCart = productInCartRepository.save(addProduct)

            return productInCartMapper.toDto(saveProductInCart)
        } else {
            productExist.quantity = quantityP

            val productUpdate = productInCartRepository.save(productExist)
            return productInCartMapper.toDto(productUpdate)
        }
    }

    override fun deleteProductInCart(productInCartRequest: ProductInCartRequest) {
        val cartId = productInCartRequest.idCart
        val productId = productInCartRequest.productId

        val optionalProductInCart = productInCartRepository.findByProductIdProductAndShoppingCartIdCart(productId,cartId)

        if (optionalProductInCart.isPresent) {
            productInCartRepository.deleteById(optionalProductInCart.get().idShop)
        }else {
            throw ResponseStatusException(HttpStatus.NOT_FOUND,"Producto no se encuentra en carrito")
        }
    }

    override fun updateProductQuantity(productInCartRequest: ProductInCartRequest): ProductInCartDto {
        val cartId = productInCartRequest.idCart
        val productId = productInCartRequest.productId
        val quantityC = productInCartRequest.quantity
        val optionalProductInCart = productInCartRepository.findByProductIdProductAndShoppingCartIdCart(productId,cartId)

        if (optionalProductInCart.isPresent) {
            val chQuantity = optionalProductInCart.get()
            chQuantity.quantity = quantityC
            val saveQuantity = productInCartRepository.save(chQuantity)
            return productInCartMapper.toDto(saveQuantity)
        } else {
            throw ResponseStatusException(HttpStatus.NOT_FOUND, "Producto no encontrado en carrito")
        }
    }
}