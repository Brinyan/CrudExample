package com.proyecto.ejemplo.controller.product.v1;

@org.springframework.web.bind.annotation.RestController
@org.springframework.web.bind.annotation.RequestMapping(value = {"/v1/product"})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\u0017J\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/proyecto/ejemplo/controller/product/v1/ProductController;", "", "productService", "Lcom/proyecto/ejemplo/service/product/ProductService;", "(Lcom/proyecto/ejemplo/service/product/ProductService;)V", "createProduct", "Lorg/springframework/http/ResponseEntity;", "Lcom/proyecto/ejemplo/dto/product/v1/ProductDto;", "productRequest", "Lcom/proyecto/ejemplo/dto/product/v1/ProductRequest;", "getProductById", "productId", "Ljava/util/UUID;", "ejemplo"})
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
}