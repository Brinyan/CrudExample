package com.proyecto.ejemplo.model.productInCar.v1;

@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "products_in_cart")
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010!\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\"\u001a\u00020\tH\u00c6\u0003J5\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u00c6\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\'\u001a\u00020\tH\u00d6\u0001J\t\u0010(\u001a\u00020)H\u00d6\u0001R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u00a8\u0006*"}, d2 = {"Lcom/proyecto/ejemplo/model/productInCar/v1/ProductInCart;", "", "shoppingCart", "Lcom/proyecto/ejemplo/model/shoppingCart/v1/ShoppingCart;", "product", "Lcom/proyecto/ejemplo/model/product/v1/Product;", "totalCost", "", "quantity", "", "(Lcom/proyecto/ejemplo/model/shoppingCart/v1/ShoppingCart;Lcom/proyecto/ejemplo/model/product/v1/Product;JI)V", "idShop", "Ljava/util/UUID;", "getIdShop", "()Ljava/util/UUID;", "getProduct", "()Lcom/proyecto/ejemplo/model/product/v1/Product;", "setProduct", "(Lcom/proyecto/ejemplo/model/product/v1/Product;)V", "getQuantity", "()I", "setQuantity", "(I)V", "getShoppingCart", "()Lcom/proyecto/ejemplo/model/shoppingCart/v1/ShoppingCart;", "setShoppingCart", "(Lcom/proyecto/ejemplo/model/shoppingCart/v1/ShoppingCart;)V", "getTotalCost", "()J", "setTotalCost", "(J)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "ejemplo"})
public final class ProductInCart {
    @jakarta.persistence.ManyToOne
    @jakarta.persistence.JoinColumn(name = "id_cart")
    @org.jetbrains.annotations.Nullable
    private com.proyecto.ejemplo.model.shoppingCart.v1.ShoppingCart shoppingCart;
    @jakarta.persistence.ManyToOne
    @jakarta.persistence.JoinColumn(name = "id_product")
    @org.jetbrains.annotations.Nullable
    private com.proyecto.ejemplo.model.product.v1.Product product;
    @jakarta.persistence.Column
    private long totalCost;
    @jakarta.persistence.Column
    private int quantity;
    @jakarta.persistence.Id
    @org.jetbrains.annotations.NotNull
    private final java.util.UUID idShop = null;
    
    public ProductInCart(@org.jetbrains.annotations.Nullable
    com.proyecto.ejemplo.model.shoppingCart.v1.ShoppingCart shoppingCart, @org.jetbrains.annotations.Nullable
    com.proyecto.ejemplo.model.product.v1.Product product, long totalCost, int quantity) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.proyecto.ejemplo.model.shoppingCart.v1.ShoppingCart getShoppingCart() {
        return null;
    }
    
    public final void setShoppingCart(@org.jetbrains.annotations.Nullable
    com.proyecto.ejemplo.model.shoppingCart.v1.ShoppingCart p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.proyecto.ejemplo.model.product.v1.Product getProduct() {
        return null;
    }
    
    public final void setProduct(@org.jetbrains.annotations.Nullable
    com.proyecto.ejemplo.model.product.v1.Product p0) {
    }
    
    public final long getTotalCost() {
        return 0L;
    }
    
    public final void setTotalCost(long p0) {
    }
    
    public final int getQuantity() {
        return 0;
    }
    
    public final void setQuantity(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.UUID getIdShop() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.proyecto.ejemplo.model.shoppingCart.v1.ShoppingCart component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.proyecto.ejemplo.model.product.v1.Product component2() {
        return null;
    }
    
    public final long component3() {
        return 0L;
    }
    
    public final int component4() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.proyecto.ejemplo.model.productInCar.v1.ProductInCart copy(@org.jetbrains.annotations.Nullable
    com.proyecto.ejemplo.model.shoppingCart.v1.ShoppingCart shoppingCart, @org.jetbrains.annotations.Nullable
    com.proyecto.ejemplo.model.product.v1.Product product, long totalCost, int quantity) {
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