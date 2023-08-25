package com.proyecto.ejemplo.dto.shoppingCart.v1;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/proyecto/ejemplo/dto/shoppingCart/v1/ShoppingCartMapper;", "", "toDto", "Lcom/proyecto/ejemplo/dto/shoppingCart/v1/ShoppingCartDto;", "shoppingCart", "Lcom/proyecto/ejemplo/model/shoppingCart/v1/ShoppingCart;", "toEntity", "shoppingCartRequest", "Lcom/proyecto/ejemplo/dto/shoppingCart/v1/ShoppingCartRequest;", "ejemplo"})
@org.mapstruct.Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = org.mapstruct.NullValuePropertyMappingStrategy.IGNORE, unmappedTargetPolicy = org.mapstruct.ReportingPolicy.IGNORE, nullValueCheckStrategy = org.mapstruct.NullValueCheckStrategy.ALWAYS, collectionMappingStrategy = org.mapstruct.CollectionMappingStrategy.SETTER_PREFERRED)
public abstract interface ShoppingCartMapper {
    
    @org.mapstruct.Mappings(value = {})
    @org.jetbrains.annotations.NotNull
    public abstract com.proyecto.ejemplo.dto.shoppingCart.v1.ShoppingCartDto toDto(@org.jetbrains.annotations.NotNull
    com.proyecto.ejemplo.model.shoppingCart.v1.ShoppingCart shoppingCart);
    
    @org.jetbrains.annotations.NotNull
    public abstract com.proyecto.ejemplo.model.shoppingCart.v1.ShoppingCart toEntity(@org.jetbrains.annotations.NotNull
    com.proyecto.ejemplo.dto.shoppingCart.v1.ShoppingCartRequest shoppingCartRequest);
}