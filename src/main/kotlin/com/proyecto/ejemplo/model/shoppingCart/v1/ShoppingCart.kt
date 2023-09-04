package com.proyecto.ejemplo.model.shoppingCart.v1

import com.proyecto.ejemplo.model.product.v1.Product
import com.proyecto.ejemplo.model.productInCar.v1.ProductInCart
import jakarta.persistence.*
import org.hibernate.annotations.Formula
import java.time.LocalDateTime
import java.util.UUID

@Entity
@Table(name = "shopping_carts")

data class ShoppingCart(
        @Column
        val dateCreation: LocalDateTime = LocalDateTime.now(),

){
    @Id
    val idCart: UUID = UUID.randomUUID()
    @OneToMany(mappedBy = "shoppingCart")
    val products: MutableList<ProductInCart> = mutableListOf()
    @Column
    var totalProducts : Int? = 0
    @Column
    var totalPrice : Long? = 0
}
