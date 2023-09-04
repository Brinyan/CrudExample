package com.proyecto.ejemplo.service.product.impl;

@org.springframework.stereotype.Service
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/proyecto/ejemplo/service/product/impl/ProductServiceImplement;", "Lcom/proyecto/ejemplo/service/product/ProductService;", "productRepository", "Lcom/proyecto/ejemplo/repositories/ProductRepository;", "productMapper", "Lcom/proyecto/ejemplo/dto/product/v1/ProductMapper;", "(Lcom/proyecto/ejemplo/repositories/ProductRepository;Lcom/proyecto/ejemplo/dto/product/v1/ProductMapper;)V", "createProduct", "Lcom/proyecto/ejemplo/dto/product/v1/ProductDto;", "productRequest", "Lcom/proyecto/ejemplo/dto/product/v1/ProductRequest;", "getAllProducts", "Lorg/springframework/data/domain/Page;", "pageable", "Lorg/springframework/data/domain/Pageable;", "getProductById", "productId", "Ljava/util/UUID;", "updateProduct", "idProduct", "productUpdateRequest", "Lcom/proyecto/ejemplo/dto/product/v1/ProductUpdateRequest;", "ejemplo"})
public class ProductServiceImplement implements com.proyecto.ejemplo.service.product.ProductService {
    @org.jetbrains.annotations.NotNull
    private final com.proyecto.ejemplo.repositories.ProductRepository productRepository = null;
    @org.jetbrains.annotations.NotNull
    private final com.proyecto.ejemplo.dto.product.v1.ProductMapper productMapper = null;
    
    public ProductServiceImplement(@org.jetbrains.annotations.NotNull
    com.proyecto.ejemplo.repositories.ProductRepository productRepository, @org.jetbrains.annotations.NotNull
    com.proyecto.ejemplo.dto.product.v1.ProductMapper productMapper) {
        super();
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
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.proyecto.ejemplo.dto.product.v1.ProductDto updateProduct(@org.jetbrains.annotations.NotNull
    java.util.UUID idProduct, @org.jetbrains.annotations.NotNull
    com.proyecto.ejemplo.dto.product.v1.ProductUpdateRequest productUpdateRequest) {
        return null;
    }
}