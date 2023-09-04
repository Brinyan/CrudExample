package com.proyecto.ejemplo.controller.product.v1;

@org.springframework.web.bind.annotation.RestController
@org.springframework.web.bind.annotation.RequestMapping(value = {"/v1/product"})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\u0017J\u001e\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b0\u00062\b\b\u0001\u0010\f\u001a\u00020\rH\u0017J\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u0017J\"\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0012\u001a\u00020\u00102\b\b\u0001\u0010\u0013\u001a\u00020\u0014H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/proyecto/ejemplo/controller/product/v1/ProductController;", "", "productService", "Lcom/proyecto/ejemplo/service/product/ProductService;", "(Lcom/proyecto/ejemplo/service/product/ProductService;)V", "createProduct", "Lorg/springframework/http/ResponseEntity;", "Lcom/proyecto/ejemplo/dto/product/v1/ProductDto;", "productRequest", "Lcom/proyecto/ejemplo/dto/product/v1/ProductRequest;", "getAllProducts", "Lorg/springframework/data/domain/Page;", "pageable", "Lorg/springframework/data/domain/Pageable;", "getProductById", "productId", "Ljava/util/UUID;", "updateProduct", "idProduct", "productUpdateRequest", "Lcom/proyecto/ejemplo/dto/product/v1/ProductUpdateRequest;", "ejemplo"})
public class ProductController {
    @org.jetbrains.annotations.NotNull
    private final com.proyecto.ejemplo.service.product.ProductService productService = null;
    
    public ProductController(@org.jetbrains.annotations.NotNull
    com.proyecto.ejemplo.service.product.ProductService productService) {
        super();
    }
    
    @org.springframework.web.bind.annotation.PostMapping(value = {"/create"})
    @org.jetbrains.annotations.NotNull
    public org.springframework.http.ResponseEntity<com.proyecto.ejemplo.dto.product.v1.ProductDto> createProduct(@org.springframework.web.bind.annotation.RequestBody
    @org.jetbrains.annotations.NotNull
    com.proyecto.ejemplo.dto.product.v1.ProductRequest productRequest) {
        return null;
    }
    
    @org.springframework.web.bind.annotation.GetMapping(value = {"/getProductById/{productId}"})
    @org.jetbrains.annotations.NotNull
    public org.springframework.http.ResponseEntity<com.proyecto.ejemplo.dto.product.v1.ProductDto> getProductById(@org.springframework.web.bind.annotation.PathVariable
    @org.jetbrains.annotations.NotNull
    java.util.UUID productId) {
        return null;
    }
    
    @org.springframework.web.bind.annotation.GetMapping(value = {"/getAllProducts"})
    @org.jetbrains.annotations.NotNull
    public org.springframework.http.ResponseEntity<org.springframework.data.domain.Page<com.proyecto.ejemplo.dto.product.v1.ProductDto>> getAllProducts(@org.springframework.data.web.PageableDefault(size = 10, page = 0)
    @org.jetbrains.annotations.NotNull
    org.springframework.data.domain.Pageable pageable) {
        return null;
    }
    
    @org.springframework.web.bind.annotation.PatchMapping(value = {"{idProduct}/updateProduct"})
    @org.jetbrains.annotations.NotNull
    public org.springframework.http.ResponseEntity<com.proyecto.ejemplo.dto.product.v1.ProductDto> updateProduct(@org.springframework.web.bind.annotation.PathVariable
    @org.jetbrains.annotations.NotNull
    java.util.UUID idProduct, @org.springframework.web.bind.annotation.RequestBody
    @org.jetbrains.annotations.NotNull
    com.proyecto.ejemplo.dto.product.v1.ProductUpdateRequest productUpdateRequest) {
        return null;
    }
}