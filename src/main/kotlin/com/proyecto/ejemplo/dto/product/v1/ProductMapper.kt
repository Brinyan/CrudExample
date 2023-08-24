package com.proyecto.ejemplo.dto.product.v1

import com.proyecto.ejemplo.model.product.v1.Product
import org.mapstruct.*

@Mapper(
    componentModel = "spring",
    nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
    unmappedTargetPolicy = ReportingPolicy.IGNORE,
    nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
    collectionMappingStrategy = CollectionMappingStrategy.SETTER_PREFERRED,
)

interface ProductMapper {
    @Mappings
    fun toDto (product: Product) : ProductDto
    fun toEntity (productRequest: ProductRequest) : Product
}

