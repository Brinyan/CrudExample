package com.proyecto.ejemplo.model.productInCar.v1

import com.proyecto.ejemplo.model.shoppingCart.v1.ShoppingCart
import com.proyecto.ejemplo.model.product.v1.Product
import jakarta.persistence.*

@Entity
@Table(name = "products_in_cart")

data class ProductInCart (

    @Id
    val idShop : Int,

    @ManyToOne
    @JoinColumn(name = "id_cart")
    var shoppingCart: ShoppingCart? = null,

    @ManyToOne
    @JoinColumn(name = "id_product")
    var product: Product? = null,

    @Column
    val totalCost : Long,

    @Column
    val totalProduct: Int,

    @Column
    var quantity: Int
)