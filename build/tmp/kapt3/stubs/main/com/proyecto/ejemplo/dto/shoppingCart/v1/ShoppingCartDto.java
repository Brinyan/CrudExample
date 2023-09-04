package com.proyecto.ejemplo.dto.shoppingCart.v1;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u0006\u001e"}, d2 = {"Lcom/proyecto/ejemplo/dto/shoppingCart/v1/ShoppingCartDto;", "", "idCart", "Ljava/util/UUID;", "dateCreation", "Ljava/time/LocalDateTime;", "products", "", "Lcom/proyecto/ejemplo/dto/productInCart/v1/ProductInCartDto;", "(Ljava/util/UUID;Ljava/time/LocalDateTime;Ljava/util/List;)V", "getDateCreation", "()Ljava/time/LocalDateTime;", "getIdCart", "()Ljava/util/UUID;", "getProducts", "()Ljava/util/List;", "totalPriceCart", "", "getTotalPriceCart", "()Ljava/lang/Long;", "setTotalPriceCart", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "totalProduct", "", "getTotalProduct", "()Ljava/lang/Integer;", "setTotalProduct", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "ejemplo"})
public final class ShoppingCartDto {
    @org.jetbrains.annotations.NotNull
    private final java.util.UUID idCart = null;
    @org.jetbrains.annotations.NotNull
    private final java.time.LocalDateTime dateCreation = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.proyecto.ejemplo.dto.productInCart.v1.ProductInCartDto> products = null;
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer totalProduct;
    @org.jetbrains.annotations.Nullable
    private java.lang.Long totalPriceCart;
    
    public ShoppingCartDto(@org.jetbrains.annotations.NotNull
    java.util.UUID idCart, @org.jetbrains.annotations.NotNull
    java.time.LocalDateTime dateCreation, @org.jetbrains.annotations.NotNull
    java.util.List<com.proyecto.ejemplo.dto.productInCart.v1.ProductInCartDto> products) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.UUID getIdCart() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.time.LocalDateTime getDateCreation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.proyecto.ejemplo.dto.productInCart.v1.ProductInCartDto> getProducts() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getTotalProduct() {
        return null;
    }
    
    public final void setTotalProduct(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getTotalPriceCart() {
        return null;
    }
    
    public final void setTotalPriceCart(@org.jetbrains.annotations.Nullable
    java.lang.Long p0) {
    }
}