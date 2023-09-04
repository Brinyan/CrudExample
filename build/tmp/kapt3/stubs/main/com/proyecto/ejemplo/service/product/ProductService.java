package com.proyecto.ejemplo.service.product;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H&\u00a8\u0006\u0011"}, d2 = {"Lcom/proyecto/ejemplo/service/product/ProductService;", "", "createProduct", "Lcom/proyecto/ejemplo/dto/product/v1/ProductDto;", "productRequest", "Lcom/proyecto/ejemplo/dto/product/v1/ProductRequest;", "getAllProducts", "Lorg/springframework/data/domain/Page;", "pageable", "Lorg/springframework/data/domain/Pageable;", "getProductById", "productId", "Ljava/util/UUID;", "updateProduct", "idProduct", "productUpdateRequest", "Lcom/proyecto/ejemplo/dto/product/v1/ProductUpdateRequest;", "ejemplo"})
public abstract interface ProductService {
    
    @org.jetbrains.annotations.NotNull
    public abstract com.proyecto.ejemplo.dto.product.v1.ProductDto createProduct(@org.jetbrains.annotations.NotNull
    com.proyecto.ejemplo.dto.product.v1.ProductRequest productRequest);
    
    @org.jetbrains.annotations.NotNull
    public abstract com.proyecto.ejemplo.dto.product.v1.ProductDto getProductById(@org.jetbrains.annotations.NotNull
    java.util.UUID productId);
    
    @org.jetbrains.annotations.NotNull
    public abstract org.springframework.data.domain.Page<com.proyecto.ejemplo.dto.product.v1.ProductDto> getAllProducts(@org.jetbrains.annotations.NotNull
    org.springframework.data.domain.Pageable pageable);
    
    @org.jetbrains.annotations.NotNull
    public abstract com.proyecto.ejemplo.dto.product.v1.ProductDto updateProduct(@org.jetbrains.annotations.NotNull
    java.util.UUID idProduct, @org.jetbrains.annotations.NotNull
    com.proyecto.ejemplo.dto.product.v1.ProductUpdateRequest productUpdateRequest);
}