package com.proyecto.ejemplo.model.shoppingCart.v1;

@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "shopping_carts")
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010#\u001a\u00020\u0018H\u00d6\u0001J\t\u0010$\u001a\u00020%H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u0006&"}, d2 = {"Lcom/proyecto/ejemplo/model/shoppingCart/v1/ShoppingCart;", "", "dateCreation", "Ljava/time/LocalDateTime;", "(Ljava/time/LocalDateTime;)V", "getDateCreation", "()Ljava/time/LocalDateTime;", "idCart", "Ljava/util/UUID;", "getIdCart", "()Ljava/util/UUID;", "products", "", "Lcom/proyecto/ejemplo/model/productInCar/v1/ProductInCart;", "getProducts", "()Ljava/util/List;", "totalPrice", "", "getTotalPrice", "()Ljava/lang/Long;", "setTotalPrice", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "totalProducts", "", "getTotalProducts", "()Ljava/lang/Integer;", "setTotalProducts", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "ejemplo"})
public final class ShoppingCart {
    @jakarta.persistence.Column
    @org.jetbrains.annotations.NotNull
    private final java.time.LocalDateTime dateCreation = null;
    @jakarta.persistence.Id
    @org.jetbrains.annotations.NotNull
    private final java.util.UUID idCart = null;
    @jakarta.persistence.OneToMany(mappedBy = "shoppingCart")
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.proyecto.ejemplo.model.productInCar.v1.ProductInCart> products = null;
    @jakarta.persistence.Column
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer totalProducts = 0;
    @jakarta.persistence.Column
    @org.jetbrains.annotations.Nullable
    private java.lang.Long totalPrice = 0L;
    
    public ShoppingCart(@org.jetbrains.annotations.NotNull
    java.time.LocalDateTime dateCreation) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.time.LocalDateTime getDateCreation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.UUID getIdCart() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.proyecto.ejemplo.model.productInCar.v1.ProductInCart> getProducts() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getTotalProducts() {
        return null;
    }
    
    public final void setTotalProducts(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getTotalPrice() {
        return null;
    }
    
    public final void setTotalPrice(@org.jetbrains.annotations.Nullable
    java.lang.Long p0) {
    }
    
    public ShoppingCart() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.time.LocalDateTime component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.proyecto.ejemplo.model.shoppingCart.v1.ShoppingCart copy(@org.jetbrains.annotations.NotNull
    java.time.LocalDateTime dateCreation) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
}