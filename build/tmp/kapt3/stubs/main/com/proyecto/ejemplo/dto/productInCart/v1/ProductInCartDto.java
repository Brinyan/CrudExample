package com.proyecto.ejemplo.dto.productInCart.v1;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/proyecto/ejemplo/dto/productInCart/v1/ProductInCartDto;", "", "shoppingCart", "Lcom/proyecto/ejemplo/dto/shoppingCart/v1/ShoppingCartDto;", "product", "Lcom/proyecto/ejemplo/dto/product/v1/ProductDto;", "quantity", "", "(Lcom/proyecto/ejemplo/dto/shoppingCart/v1/ShoppingCartDto;Lcom/proyecto/ejemplo/dto/product/v1/ProductDto;I)V", "getProduct", "()Lcom/proyecto/ejemplo/dto/product/v1/ProductDto;", "getQuantity", "()I", "getShoppingCart", "()Lcom/proyecto/ejemplo/dto/shoppingCart/v1/ShoppingCartDto;", "ejemplo"})
public final class ProductInCartDto {
    @org.jetbrains.annotations.NotNull
    private final com.proyecto.ejemplo.dto.shoppingCart.v1.ShoppingCartDto shoppingCart = null;
    @org.jetbrains.annotations.NotNull
    private final com.proyecto.ejemplo.dto.product.v1.ProductDto product = null;
    private final int quantity = 0;
    
    public ProductInCartDto(@org.jetbrains.annotations.NotNull
    com.proyecto.ejemplo.dto.shoppingCart.v1.ShoppingCartDto shoppingCart, @org.jetbrains.annotations.NotNull
    com.proyecto.ejemplo.dto.product.v1.ProductDto product, int quantity) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.proyecto.ejemplo.dto.shoppingCart.v1.ShoppingCartDto getShoppingCart() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.proyecto.ejemplo.dto.product.v1.ProductDto getProduct() {
        return null;
    }
    
    public final int getQuantity() {
        return 0;
    }
}