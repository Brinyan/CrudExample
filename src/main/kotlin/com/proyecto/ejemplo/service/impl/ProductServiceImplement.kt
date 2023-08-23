package com.proyecto.ejemplo.service.impl

import com.proyecto.ejemplo.dto.ProductDto
import com.proyecto.ejemplo.dto.ProductsInCartDto
import com.proyecto.ejemplo.dto.ShoppingCartDto
import com.proyecto.ejemplo.model.ProductsInCart
import com.proyecto.ejemplo.repositories.ProductRepository
import com.proyecto.ejemplo.repositories.ProductsInCartRepository
import com.proyecto.ejemplo.repositories.ShoppingCartRepository
import com.proyecto.ejemplo.service.ProductService
import org.springframework.stereotype.Service

@Service
class ProductServiceImplement (
    private val shoppingCartRepository : ShoppingCartRepository,
    private val productRepository: ProductRepository,
    private val productsInCartRepository: ProductsInCartRepository
    ) : ProductService {

    override fun addProductToCart(cartId: Int, productId: Int, quantity: Int) {
        val shoppingCart = shoppingCartRepository.findById(cartId)
        val product = productRepository.findById(productId)

        if (shoppingCart.isPresent && product.isPresent) {
            val productsInCart =
                ProductsInCart(shoppingCart = shoppingCart.get(), product = product.get(), totalProduct = quantity)
            productsInCartRepository.save(productsInCart)
        }
    }

    override fun getProductsInCart(cartId: Int): List<ProductsInCartDto> {
        val cart = shoppingCartRepository.findById(cartId)
        val productsInCart = productsInCartRepository.findByShoppingCart_Id(cartId)

        return if (cart.isPresent) {
            productsInCart.map {
                ProductsInCartDto(
                    idShop = it.idShop,
                    shoppingCart = ShoppingCartDto(it.shoppingCart.idCart, it.shoppingCart.dateCreation),
                    product = ProductDto(
                        it.product.idProduct,
                        it.product.nameProduct,
                        it.product.skuProduct,
                        it.product.priceProduct
                    ),
                    totalCost = it.totalCost,
                    totalProduct = it.totalProduct
                )
            }
        } else {
            emptyList()
        }
    }
}
