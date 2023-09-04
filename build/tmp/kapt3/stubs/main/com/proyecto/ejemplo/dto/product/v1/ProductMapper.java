package com.proyecto.ejemplo.dto.product.v1;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&J\u001a\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\r"}, d2 = {"Lcom/proyecto/ejemplo/dto/product/v1/ProductMapper;", "", "toDto", "Lcom/proyecto/ejemplo/dto/product/v1/ProductDto;", "product", "Lcom/proyecto/ejemplo/model/product/v1/Product;", "toEntity", "productRequest", "Lcom/proyecto/ejemplo/dto/product/v1/ProductRequest;", "updateProduct", "", "productUpdateRequest", "Lcom/proyecto/ejemplo/dto/product/v1/ProductUpdateRequest;", "ejemplo"})
@org.mapstruct.Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = org.mapstruct.NullValuePropertyMappingStrategy.IGNORE, unmappedTargetPolicy = org.mapstruct.ReportingPolicy.IGNORE, nullValueCheckStrategy = org.mapstruct.NullValueCheckStrategy.ALWAYS, collectionMappingStrategy = org.mapstruct.CollectionMappingStrategy.SETTER_PREFERRED)
public abstract interface ProductMapper {
    
    @org.mapstruct.Mappings(value = {})
    @org.jetbrains.annotations.NotNull
    public abstract com.proyecto.ejemplo.dto.product.v1.ProductDto toDto(@org.jetbrains.annotations.NotNull
    com.proyecto.ejemplo.model.product.v1.Product product);
    
    @org.jetbrains.annotations.NotNull
    public abstract com.proyecto.ejemplo.model.product.v1.Product toEntity(@org.jetbrains.annotations.NotNull
    com.proyecto.ejemplo.dto.product.v1.ProductRequest productRequest);
    
    public abstract void updateProduct(@org.jetbrains.annotations.NotNull
    com.proyecto.ejemplo.dto.product.v1.ProductUpdateRequest productUpdateRequest, @org.mapstruct.MappingTarget
    @org.jetbrains.annotations.NotNull
    com.proyecto.ejemplo.model.product.v1.Product product);
}