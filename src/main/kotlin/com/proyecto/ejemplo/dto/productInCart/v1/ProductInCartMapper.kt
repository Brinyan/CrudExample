package com.proyecto.ejemplo.dto.productInCart.v1

import com.proyecto.ejemplo.dto.product.v1.ProductMapper
import com.proyecto.ejemplo.model.productInCar.v1.ProductInCart
import com.proyecto.ejemplo.model.shoppingCart.v1.ShoppingCart
import org.mapstruct.*

@Mapper(
    componentModel = "spring",
    nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
    unmappedTargetPolicy = ReportingPolicy.IGNORE,
    nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
    collectionMappingStrategy = CollectionMappingStrategy.SETTER_PREFERRED,
    uses = [ProductMapper::class, ShoppingCart::class]
)

interface ProductInCartMapper {
    @Mappings
    fun toDto (productInCart: ProductInCart) : ProductInCartDto

}