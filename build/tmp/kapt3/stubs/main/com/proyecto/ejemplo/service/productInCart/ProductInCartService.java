package com.proyecto.ejemplo.service.productInCart;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\t"}, d2 = {"Lcom/proyecto/ejemplo/service/productInCart/ProductInCartService;", "", "addProductToCart", "Lcom/proyecto/ejemplo/dto/productInCart/v1/ProductInCartDto;", "productInCartRequest", "Lcom/proyecto/ejemplo/dto/productInCart/v1/ProductInCartRequest;", "deleteProductInCart", "", "updateProductQuantity", "ejemplo"})
public abstract interface ProductInCartService {
    
    @org.jetbrains.annotations.NotNull
    public abstract com.proyecto.ejemplo.dto.productInCart.v1.ProductInCartDto addProductToCart(@org.jetbrains.annotations.NotNull
    com.proyecto.ejemplo.dto.productInCart.v1.ProductInCartRequest productInCartRequest);
    
    public abstract void deleteProductInCart(@org.jetbrains.annotations.NotNull
    com.proyecto.ejemplo.dto.productInCart.v1.ProductInCartRequest productInCartRequest);
    
    @org.jetbrains.annotations.NotNull
    public abstract com.proyecto.ejemplo.dto.productInCart.v1.ProductInCartDto updateProductQuantity(@org.jetbrains.annotations.NotNull
    com.proyecto.ejemplo.dto.productInCart.v1.ProductInCartRequest productInCartRequest);
}