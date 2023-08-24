package com.proyecto.ejemplo.controller.shoppingCart.v1;

@org.springframework.web.bind.annotation.RestController
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J&\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\nH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/proyecto/ejemplo/controller/shoppingCart/v1/ShoppingCartController;", "", "productService", "Lcom/proyecto/ejemplo/service/ProductService;", "(Lcom/proyecto/ejemplo/service/ProductService;)V", "addProducts", "", "shoppingCartId", "Ljava/util/UUID;", "productId", "", "totalProducts", "ejemplo"})
public class ShoppingCartController {
    @org.jetbrains.annotations.NotNull
    private final com.proyecto.ejemplo.service.ProductService productService = null;
    
    public ShoppingCartController(@org.jetbrains.annotations.NotNull
    com.proyecto.ejemplo.service.ProductService productService) {
        super();
    }
    
    @org.springframework.web.bind.annotation.PostMapping(value = {"/addProduct/{shoppingCartId}/{productId}/{totalProducts}"})
    public void addProducts(@org.springframework.web.bind.annotation.PathVariable
    @org.jetbrains.annotations.NotNull
    java.util.UUID shoppingCartId, @org.springframework.web.bind.annotation.PathVariable
    int productId, @org.springframework.web.bind.annotation.PathVariable
    int totalProducts) {
    }
}