package com.proyecto.ejemplo.service.shoppingCart.impl

import com.proyecto.ejemplo.dto.shoppingCart.v1.ShoppingCartDto
import com.proyecto.ejemplo.dto.shoppingCart.v1.ShoppingCartMapper
import com.proyecto.ejemplo.dto.shoppingCart.v1.ShoppingCartRequest
import com.proyecto.ejemplo.repositories.ShoppingCartRepository
import com.proyecto.ejemplo.service.shoppingCart.ShoppingCartService
import org.springframework.stereotype.Service

@Service
class ShoppingCartIServicempl (
    private val shoppingCartRepository: ShoppingCartRepository,
    private val shoppingCartMapper: ShoppingCartMapper
    ) : ShoppingCartService {
    override fun createShoppingCart(shoppingCartRequest: ShoppingCartRequest): ShoppingCartDto {
        val shoppingCartEntity = shoppingCartMapper.toEntity(shoppingCartRequest)
        val savedShoppingCart = shoppingCartRepository.save(shoppingCartEntity)
        return shoppingCartMapper.toDto(savedShoppingCart)
    }
}