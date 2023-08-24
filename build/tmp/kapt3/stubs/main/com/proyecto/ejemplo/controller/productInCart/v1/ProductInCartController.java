package com.proyecto.ejemplo.controller.productInCart.v1;

@org.springframework.web.bind.annotation.RestController
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/proyecto/ejemplo/controller/productInCart/v1/ProductInCartController;", "", "productService", "Lcom/proyecto/ejemplo/service/ProductService;", "(Lcom/proyecto/ejemplo/service/ProductService;)V", "getProductsInCart", "", "Lcom/proyecto/ejemplo/dto/productInCart/v1/ProductInCartDto;", "cartId", "Ljava/util/UUID;", "ejemplo"})
public class ProductInCartController {
    @org.jetbrains.annotations.NotNull
    private final com.proyecto.ejemplo.service.ProductService productService = null;
    
    public ProductInCartController(@org.jetbrains.annotations.NotNull
    com.proyecto.ejemplo.service.ProductService productService) {
        super();
    }
    
    @org.springframework.web.bind.annotation.GetMapping(value = {"/getProductsInCart/{cartId}"})
    @org.jetbrains.annotations.NotNull
    public java.util.List<com.proyecto.ejemplo.dto.productInCart.v1.ProductInCartDto> getProductsInCart(@org.springframework.web.bind.annotation.PathVariable
    @org.jetbrains.annotations.NotNull
    java.util.UUID cartId) {
        return null;
    }
}