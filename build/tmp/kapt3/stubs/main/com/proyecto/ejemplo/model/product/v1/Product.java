package com.proyecto.ejemplo.model.product.v1;

@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "products")
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0012J.\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\"\u001a\u00020\u0005H\u00d6\u0001J\t\u0010#\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u00a8\u0006$"}, d2 = {"Lcom/proyecto/ejemplo/model/product/v1/Product;", "", "nameProduct", "", "skuProduct", "", "priceProduct", "", "(Ljava/lang/String;ILjava/lang/Long;)V", "idProduct", "Ljava/util/UUID;", "getIdProduct", "()Ljava/util/UUID;", "getNameProduct", "()Ljava/lang/String;", "setNameProduct", "(Ljava/lang/String;)V", "getPriceProduct", "()Ljava/lang/Long;", "setPriceProduct", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getSkuProduct", "()I", "setSkuProduct", "(I)V", "component1", "component2", "component3", "copy", "(Ljava/lang/String;ILjava/lang/Long;)Lcom/proyecto/ejemplo/model/product/v1/Product;", "equals", "", "other", "hashCode", "toString", "ejemplo"})
public final class Product {
    @jakarta.persistence.Column
    @org.jetbrains.annotations.NotNull
    private java.lang.String nameProduct;
    @jakarta.persistence.Column
    private int skuProduct;
    @jakarta.persistence.Column
    @org.jetbrains.annotations.Nullable
    private java.lang.Long priceProduct;
    @jakarta.persistence.Id
    @org.jetbrains.annotations.NotNull
    private final java.util.UUID idProduct = null;
    
    public Product(@org.jetbrains.annotations.NotNull
    java.lang.String nameProduct, int skuProduct, @org.jetbrains.annotations.Nullable
    java.lang.Long priceProduct) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getNameProduct() {
        return null;
    }
    
    public final void setNameProduct(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final int getSkuProduct() {
        return 0;
    }
    
    public final void setSkuProduct(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getPriceProduct() {
        return null;
    }
    
    public final void setPriceProduct(@org.jetbrains.annotations.Nullable
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.UUID getIdProduct() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.proyecto.ejemplo.model.product.v1.Product copy(@org.jetbrains.annotations.NotNull
    java.lang.String nameProduct, int skuProduct, @org.jetbrains.annotations.Nullable
    java.lang.Long priceProduct) {
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