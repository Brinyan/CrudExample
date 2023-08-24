package com.proyecto.ejemplo.model.productInCar.v1;

@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "products_in_cart")
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f\u00a8\u0006\u001f"}, d2 = {"Lcom/proyecto/ejemplo/model/productInCar/v1/ProductInCart;", "", "idShop", "", "shoppingCart", "Lcom/proyecto/ejemplo/model/shoppingCart/v1/ShoppingCart;", "product", "Lcom/proyecto/ejemplo/model/product/v1/Product;", "totalCost", "totalProduct", "(ILcom/proyecto/ejemplo/model/shoppingCart/v1/ShoppingCart;Lcom/proyecto/ejemplo/model/product/v1/Product;II)V", "getIdShop", "()I", "getProduct", "()Lcom/proyecto/ejemplo/model/product/v1/Product;", "getShoppingCart", "()Lcom/proyecto/ejemplo/model/shoppingCart/v1/ShoppingCart;", "getTotalCost", "getTotalProduct", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "ejemplo"})
public final class ProductInCart {
    @jakarta.persistence.Id
    @jakarta.persistence.GeneratedValue
    private final int idShop = 0;
    @jakarta.persistence.ManyToOne
    @jakarta.persistence.JoinColumn(name = "shopping_cart_id")
    @org.jetbrains.annotations.NotNull
    private final com.proyecto.ejemplo.model.shoppingCart.v1.ShoppingCart shoppingCart = null;
    @jakarta.persistence.ManyToOne
    @jakarta.persistence.JoinColumn(name = "product_id")
    @org.jetbrains.annotations.NotNull
    private final com.proyecto.ejemplo.model.product.v1.Product product = null;
    @jakarta.persistence.Column
    private final int totalCost = 0;
    @jakarta.persistence.Column
    private final int totalProduct = 0;
    
    public ProductInCart(int idShop, @org.jetbrains.annotations.NotNull
    com.proyecto.ejemplo.model.shoppingCart.v1.ShoppingCart shoppingCart, @org.jetbrains.annotations.NotNull
    com.proyecto.ejemplo.model.product.v1.Product product, int totalCost, int totalProduct) {
        super();
    }
    
    public final int getIdShop() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.proyecto.ejemplo.model.shoppingCart.v1.ShoppingCart getShoppingCart() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.proyecto.ejemplo.model.product.v1.Product getProduct() {
        return null;
    }
    
    public final int getTotalCost() {
        return 0;
    }
    
    public final int getTotalProduct() {
        return 0;
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.proyecto.ejemplo.model.shoppingCart.v1.ShoppingCart component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.proyecto.ejemplo.model.product.v1.Product component3() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int component5() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.proyecto.ejemplo.model.productInCar.v1.ProductInCart copy(int idShop, @org.jetbrains.annotations.NotNull
    com.proyecto.ejemplo.model.shoppingCart.v1.ShoppingCart shoppingCart, @org.jetbrains.annotations.NotNull
    com.proyecto.ejemplo.model.product.v1.Product product, int totalCost, int totalProduct) {
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