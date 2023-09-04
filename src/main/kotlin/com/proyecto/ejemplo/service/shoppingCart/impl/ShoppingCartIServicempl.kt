package com.proyecto.ejemplo.service.shoppingCart.impl

import com.proyecto.ejemplo.dto.product.v1.ProductDto
import com.proyecto.ejemplo.dto.productInCart.v1.ProductInCartDto
import com.proyecto.ejemplo.dto.productInCart.v1.ProductInCartMapper
import com.proyecto.ejemplo.dto.shoppingCart.v1.ShoppingCartDto
import com.proyecto.ejemplo.dto.shoppingCart.v1.ShoppingCartMapper
import com.proyecto.ejemplo.dto.shoppingCart.v1.ShoppingCartRequest
import com.proyecto.ejemplo.model.product.v1.Product
import com.proyecto.ejemplo.model.productInCar.v1.ProductInCart
import com.proyecto.ejemplo.repositories.ShoppingCartRepository
import com.proyecto.ejemplo.service.shoppingCart.ShoppingCartService
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException
import java.util.*

@Service
class ShoppingCartIServicempl (
    private val shoppingCartRepository: ShoppingCartRepository,
    private val shoppingCartMapper: ShoppingCartMapper,
    ) : ShoppingCartService {
    override fun createShoppingCart(shoppingCartRequest: ShoppingCartRequest): ShoppingCartDto {
        val shoppingCartEntity = shoppingCartMapper.toEntity(shoppingCartRequest)
        val savedShoppingCart = shoppingCartRepository.save(shoppingCartEntity)
        return shoppingCartMapper.toDto(savedShoppingCart)
    }

    override fun getAllProductsInCart(cartId: UUID): ShoppingCartDto {
        val shoppingCart = shoppingCartRepository.findById(cartId).orElseThrow { throw ResponseStatusException(HttpStatus.NOT_FOUND, "Carrito no encontrado") }
        shoppingCartRepository.save(shoppingCart)

        val response = shoppingCartMapper.toDto(shoppingCart)
        response.totalProduct = shoppingCart.products.sumOf { it.quantity }
        response.totalPriceCart = shoppingCart.products.sumOf { it.totalCost }

        return response
    }
}