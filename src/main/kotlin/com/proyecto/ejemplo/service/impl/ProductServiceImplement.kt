package com.proyecto.ejemplo.service.impl


import com.proyecto.ejemplo.dto.productInCart.v1.ProductInCartMapper
import com.proyecto.ejemplo.dto.productInCart.v1.ProductInCartDto
import com.proyecto.ejemplo.model.productInCar.v1.ProductInCart
import com.proyecto.ejemplo.repositories.ProductRepository
import com.proyecto.ejemplo.repositories.ProductInCartRepository
import com.proyecto.ejemplo.repositories.ShoppingCartRepository
import com.proyecto.ejemplo.service.ProductService
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class ProductServiceImplement (
    private val shoppingCartRepository : ShoppingCartRepository,
    private val productRepository: ProductRepository,
    private val productsInCartRepository: ProductInCartRepository,
    private val productInCartMapper: ProductInCartMapper
    ) : ProductService {

    override fun addProductToCart(cartId: UUID, productId: Int, quantity: Int) {
        val shoppingCart = shoppingCartRepository.findById(cartId)
        val product = productRepository.findById(productId)

        if (shoppingCart.isPresent && product.isPresent) {
            val productInCart =
                ProductInCart(shoppingCart = shoppingCart.get(), product = product.get(), totalProduct = quantity)
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
}
