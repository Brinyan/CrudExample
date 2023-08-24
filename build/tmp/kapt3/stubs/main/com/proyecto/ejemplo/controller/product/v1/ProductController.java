package com.proyecto.ejemplo.controller.product.v1;

@org.springframework.web.bind.annotation.RestController
@org.springframework.web.bind.annotation.RequestMapping(value = {"/product"})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\b\u001a\u00020\u0007H\u0017J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0017J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\rH\u0017J\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0017J\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\b\u001a\u00020\u0007H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/proyecto/ejemplo/controller/product/v1/ProductController;", "", "productRepository", "Lcom/proyecto/ejemplo/repositories/ProductRepository;", "(Lcom/proyecto/ejemplo/repositories/ProductRepository;)V", "createProduct", "Lorg/springframework/http/ResponseEntity;", "Lcom/proyecto/ejemplo/model/product/v1/Product;", "product", "deleteProductById", "productId", "", "getAllProducts", "", "getProductById", "updateProductById", "ejemplo"})
public class ProductController {
    @org.jetbrains.annotations.NotNull
    private final com.proyecto.ejemplo.repositories.ProductRepository productRepository = null;
    
    public ProductController(@org.springframework.beans.factory.annotation.Autowired
    @org.jetbrains.annotations.NotNull
    com.proyecto.ejemplo.repositories.ProductRepository productRepository) {
        super();
    }
    
    @org.springframework.web.bind.annotation.PostMapping(value = {"/createProduct"})
    @org.jetbrains.annotations.NotNull
    public org.springframework.http.ResponseEntity<com.proyecto.ejemplo.model.product.v1.Product> createProduct(@org.springframework.web.bind.annotation.RequestBody
    @org.jetbrains.annotations.NotNull
    com.proyecto.ejemplo.model.product.v1.Product product) {
        return null;
    }
    
    @org.springframework.web.bind.annotation.GetMapping(value = {"/getProductById/{id}"})
    @org.jetbrains.annotations.NotNull
    public org.springframework.http.ResponseEntity<com.proyecto.ejemplo.model.product.v1.Product> getProductById(@org.springframework.web.bind.annotation.PathVariable(value = "id")
    int productId) {
        return null;
    }
    
    @org.springframework.web.bind.annotation.GetMapping(value = {"/getAllProducts"})
    @org.jetbrains.annotations.NotNull
    public java.util.List<com.proyecto.ejemplo.model.product.v1.Product> getAllProducts() {
        return null;
    }
    
    @org.springframework.web.bind.annotation.PutMapping(value = {"/updateProduct/{id}"})
    @org.jetbrains.annotations.NotNull
    public org.springframework.http.ResponseEntity<com.proyecto.ejemplo.model.product.v1.Product> updateProductById(@org.springframework.web.bind.annotation.PathVariable(value = "id")
    int productId, @org.springframework.web.bind.annotation.RequestBody
    @org.jetbrains.annotations.NotNull
    com.proyecto.ejemplo.model.product.v1.Product product) {
        return null;
    }
    
    @org.springframework.web.bind.annotation.DeleteMapping(value = {"deleteProduct/{id}"})
    @org.jetbrains.annotations.NotNull
    public org.springframework.http.ResponseEntity<com.proyecto.ejemplo.model.product.v1.Product> deleteProductById(@org.springframework.web.bind.annotation.PathVariable(value = "id")
    int productId) {
        return null;
    }
}