package com.proyecto.ejemplo.service.product;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u00112\u0006\u0010\u0012\u001a\u00020\u0013H&J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0018"}, d2 = {"Lcom/proyecto/ejemplo/service/product/ProductService;", "", "addProductToCart", "", "cartId", "Ljava/util/UUID;", "productId", "quantity", "", "idShop", "totalCost", "", "createProduct", "Lcom/proyecto/ejemplo/dto/product/v1/ProductDto;", "productRequest", "Lcom/proyecto/ejemplo/dto/product/v1/ProductRequest;", "getAllProducts", "Lorg/springframework/data/domain/Page;", "pageable", "Lorg/springframework/data/domain/Pageable;", "getProductById", "getProductsInCart", "", "Lcom/proyecto/ejemplo/dto/productInCart/v1/ProductInCartDto;", "ejemplo"})
public abstract interface ProductService {
    
    public abstract void addProductToCart(@org.jetbrains.annotations.NotNull
    java.util.UUID cartId, @org.jetbrains.annotations.NotNull
    java.util.UUID productId, int quantity, int idShop, long totalCost);
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.proyecto.ejemplo.dto.productInCart.v1.ProductInCartDto> getProductsInCart(@org.jetbrains.annotations.NotNull
    java.util.UUID cartId);
    
    @org.jetbrains.annotations.NotNull
    public abstract com.proyecto.ejemplo.dto.product.v1.ProductDto createProduct(@org.jetbrains.annotations.NotNull
    com.proyecto.ejemplo.dto.product.v1.ProductRequest productRequest);
    
    @org.jetbrains.annotations.NotNull
    public abstract com.proyecto.ejemplo.dto.product.v1.ProductDto getProductById(@org.jetbrains.annotations.NotNull
    java.util.UUID productId);
    
    @org.jetbrains.annotations.NotNull
    public abstract org.springframework.data.domain.Page<com.proyecto.ejemplo.dto.product.v1.ProductDto> getAllProducts(@org.jetbrains.annotations.NotNull
    org.springframework.data.domain.Pageable pageable);
}