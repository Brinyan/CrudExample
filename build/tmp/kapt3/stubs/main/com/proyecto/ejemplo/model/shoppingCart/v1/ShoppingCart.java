package com.proyecto.ejemplo.model.shoppingCart.v1;

@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "shopping_carts")
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001b"}, d2 = {"Lcom/proyecto/ejemplo/model/shoppingCart/v1/ShoppingCart;", "", "idCart", "Ljava/util/UUID;", "dateCreation", "Ljava/time/LocalDateTime;", "products", "", "Lcom/proyecto/ejemplo/model/productInCar/v1/ProductInCart;", "(Ljava/util/UUID;Ljava/time/LocalDateTime;Ljava/util/List;)V", "getDateCreation", "()Ljava/time/LocalDateTime;", "getIdCart", "()Ljava/util/UUID;", "getProducts", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ejemplo"})
public final class ShoppingCart {
    @jakarta.persistence.Id
    @org.jetbrains.annotations.NotNull
    private final java.util.UUID idCart = null;
    @jakarta.persistence.Column
    @org.jetbrains.annotations.NotNull
    private final java.time.LocalDateTime dateCreation = null;
    @jakarta.persistence.OneToMany(mappedBy = "shoppingCart")
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.proyecto.ejemplo.model.productInCar.v1.ProductInCart> products = null;
    
    public ShoppingCart(@org.jetbrains.annotations.NotNull
    java.util.UUID idCart, @org.jetbrains.annotations.NotNull
    java.time.LocalDateTime dateCreation, @org.jetbrains.annotations.NotNull
    java.util.List<com.proyecto.ejemplo.model.productInCar.v1.ProductInCart> products) {
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
    public final java.util.List<com.proyecto.ejemplo.model.productInCar.v1.ProductInCart> getProducts() {
        return null;
    }
    
    public ShoppingCart() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.UUID component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.time.LocalDateTime component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.proyecto.ejemplo.model.productInCar.v1.ProductInCart> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.proyecto.ejemplo.model.shoppingCart.v1.ShoppingCart copy(@org.jetbrains.annotations.NotNull
    java.util.UUID idCart, @org.jetbrains.annotations.NotNull
    java.time.LocalDateTime dateCreation, @org.jetbrains.annotations.NotNull
    java.util.List<com.proyecto.ejemplo.model.productInCar.v1.ProductInCart> products) {
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