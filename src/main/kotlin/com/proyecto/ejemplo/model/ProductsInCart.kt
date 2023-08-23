package com.proyecto.ejemplo.model

import jakarta.persistence.*

@Entity
@Table(name = "productsInCart")

data class ProductsInCart (
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