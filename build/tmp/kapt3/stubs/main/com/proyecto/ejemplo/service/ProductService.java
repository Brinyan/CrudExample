package com.proyecto.ejemplo.service;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\f"}, d2 = {"Lcom/proyecto/ejemplo/service/ProductService;", "", "addProductToCart", "", "cartId", "Ljava/util/UUID;", "productId", "", "quantity", "getProductsInCart", "", "Lcom/proyecto/ejemplo/dto/productInCart/v1/ProductInCartDto;", "ejemplo"})
public abstract interface ProductService {
    
    public abstract void addProductToCart(@org.jetbrains.annotations.NotNull
    java.util.UUID cartId, int productId, int quantity);
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.proyecto.ejemplo.dto.productInCart.v1.ProductInCartDto> getProductsInCart(@org.jetbrains.annotations.NotNull
    java.util.UUID cartId);
}