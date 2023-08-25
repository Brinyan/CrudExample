package com.proyecto.ejemplo.service.product.impl;

@org.springframework.stereotype.Service
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ0\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/proyecto/ejemplo/service/product/impl/ProductServiceImplement;", "Lcom/proyecto/ejemplo/service/product/ProductService;", "shoppingCartRepository", "Lcom/proyecto/ejemplo/repositories/ShoppingCartRepository;", "productRepository", "Lcom/proyecto/ejemplo/repositories/ProductRepository;", "productsInCartRepository", "Lcom/proyecto/ejemplo/repositories/ProductInCartRepository;", "productInCartMapper", "Lcom/proyecto/ejemplo/dto/productInCart/v1/ProductInCartMapper;", "productMapper", "Lcom/proyecto/ejemplo/dto/product/v1/ProductMapper;", "(Lcom/proyecto/ejemplo/repositories/ShoppingCartRepository;Lcom/proyecto/ejemplo/repositories/ProductRepository;Lcom/proyecto/ejemplo/repositories/ProductInCartRepository;Lcom/proyecto/ejemplo/dto/productInCart/v1/ProductInCartMapper;Lcom/proyecto/ejemplo/dto/product/v1/ProductMapper;)V", "addProductToCart", "", "cartId", "Ljava/util/UUID;", "productId", "quantity", "", "idShop", "totalCost", "", "createProduct", "Lcom/proyecto/ejemplo/dto/product/v1/ProductDto;", "productRequest", "Lcom/proyecto/ejemplo/dto/product/v1/ProductRequest;", "getAllProducts", "Lorg/springframework/data/domain/Page;", "pageable", "Lorg/springframework/data/domain/Pageable;", "getProductById", "getProductsInCart", "", "Lcom/proyecto/ejemplo/dto/productInCart/v1/ProductInCartDto;", "ejemplo"})
public class ProductServiceImplement implements com.proyecto.ejemplo.service.product.ProductService {
    @org.jetbrains.annotations.NotNull
    private final com.proyecto.ejemplo.repositories.ShoppingCartRepository shoppingCartRepository = null;
    @org.jetbrains.annotations.NotNull
    private final com.proyecto.ejemplo.repositories.ProductRepository productRepository = null;
    @org.jetbrains.annotations.NotNull
    private final com.proyecto.ejemplo.repositories.ProductInCartRepository productsInCartRepository = null;
    @org.jetbrains.annotations.NotNull
    private final com.proyecto.ejemplo.dto.productInCart.v1.ProductInCartMapper productInCartMapper = null;
    @org.jetbrains.annotations.NotNull
    private final com.proyecto.ejemplo.dto.product.v1.ProductMapper productMapper = null;
    
    public ProductServiceImplement(@org.jetbrains.annotations.NotNull
    com.proyecto.ejemplo.repositories.ShoppingCartRepository shoppingCartRepository, @org.jetbrains.annotations.NotNull
    com.proyecto.ejemplo.repositories.ProductRepository productRepository, @org.jetbrains.annotations.NotNull
    com.proyecto.ejemplo.repositories.ProductInCartRepository productsInCartRepository, @org.jetbrains.annotations.NotNull
    com.proyecto.ejemplo.dto.productInCart.v1.ProductInCartMapper productInCartMapper, @org.jetbrains.annotations.NotNull
    com.proyecto.ejemplo.dto.product.v1.ProductMapper productMapper) {
        super();
    }
    
    @java.lang.Override
    public void addProductToCart(@org.jetbrains.annotations.NotNull
    java.util.UUID cartId, @org.jetbrains.annotations.NotNull
    java.util.UUID productId, int quantity, int idShop, long totalCost) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.util.List<com.proyecto.ejemplo.dto.productInCart.v1.ProductInCartDto> getProductsInCart(@org.jetbrains.annotations.NotNull
    java.util.UUID cartId) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.proyecto.ejemplo.dto.product.v1.ProductDto createProduct(@org.jetbrains.annotations.NotNull
    com.proyecto.ejemplo.dto.product.v1.ProductRequest productRequest) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.proyecto.ejemplo.dto.product.v1.ProductDto getProductById(@org.jetbrains.annotations.NotNull
    java.util.UUID productId) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public org.springframework.data.domain.Page<com.proyecto.ejemplo.dto.product.v1.ProductDto> getAllProducts(@org.jetbrains.annotations.NotNull
    org.springframework.data.domain.Pageable pageable) {
        return null;
    }
}