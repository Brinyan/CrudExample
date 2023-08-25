package com.proyecto.ejemplo.dto.shoppingCart.v1

import com.proyecto.ejemplo.model.shoppingCart.v1.ShoppingCart
import org.mapstruct.*

@Mapper(
    componentModel = "spring",
    nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
    unmappedTargetPolicy = ReportingPolicy.IGNORE,
    nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
    collectionMappingStrategy = CollectionMappingStrategy.SETTER_PREFERRED,
)

interface ShoppingCartMapper {
    @Mappings
    fun toDto (shoppingCart: ShoppingCart) : ShoppingCartDto

    fun toEntity (shoppingCartRequest: ShoppingCartRequest) : ShoppingCart
}