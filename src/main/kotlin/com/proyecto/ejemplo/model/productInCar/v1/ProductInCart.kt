package com.proyecto.ejemplo.model.productInCar.v1

import com.proyecto.ejemplo.model.shoppingCart.v1.ShoppingCart
import com.proyecto.ejemplo.model.product.v1.Product
import jakarta.persistence.*

@Entity
@Table(name = "products_in_cart")

data class ProductInCart (
    @Id
    @GeneratedValue
    val idShop : Int = 0,

    @ManyToOne
    @JoinColumn(name = "shopping_cart_id")
    val shoppingCart: ShoppingCart,

    @ManyToOne
    @JoinColumn(name = "product_id")
    val product: Product,

    @Column
    val totalCost : Int = 0,

    @Column
    val totalProduct: Int = 0
)