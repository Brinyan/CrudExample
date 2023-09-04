package com.proyecto.ejemplo.controller.shoppingCart.v1;

@org.springframework.web.bind.annotation.RestController
@org.springframework.web.bind.annotation.RequestMapping(value = {"/v1/shoppingCart"})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\u0017J\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/proyecto/ejemplo/controller/shoppingCart/v1/ShoppingCartController;", "", "shoppingCartService", "Lcom/proyecto/ejemplo/service/shoppingCart/ShoppingCartService;", "(Lcom/proyecto/ejemplo/service/shoppingCart/ShoppingCartService;)V", "createShoppingCart", "Lorg/springframework/http/ResponseEntity;", "Lcom/proyecto/ejemplo/dto/shoppingCart/v1/ShoppingCartDto;", "shoppingCartRequest", "Lcom/proyecto/ejemplo/dto/shoppingCart/v1/ShoppingCartRequest;", "getAllProducts", "cartId", "Ljava/util/UUID;", "ejemplo"})
public class ShoppingCartController {
    @org.jetbrains.annotations.NotNull
    private final com.proyecto.ejemplo.service.shoppingCart.ShoppingCartService shoppingCartService = null;
    
    public ShoppingCartController(@org.jetbrains.annotations.NotNull
    com.proyecto.ejemplo.service.shoppingCart.ShoppingCartService shoppingCartService) {
        super();
    }
    
    @org.springframework.web.bind.annotation.PostMapping
    @org.jetbrains.annotations.NotNull
    public org.springframework.http.ResponseEntity<com.proyecto.ejemplo.dto.shoppingCart.v1.ShoppingCartDto> createShoppingCart(@org.springframework.web.bind.annotation.RequestBody
    @org.jetbrains.annotations.NotNull
    com.proyecto.ejemplo.dto.shoppingCart.v1.ShoppingCartRequest shoppingCartRequest) {
        return null;
    }
    
    @org.springframework.web.bind.annotation.GetMapping(value = {"/{cartId}/products"})
    @org.jetbrains.annotations.NotNull
    public org.springframework.http.ResponseEntity<com.proyecto.ejemplo.dto.shoppingCart.v1.ShoppingCartDto> getAllProducts(@org.springframework.web.bind.annotation.PathVariable
    @org.jetbrains.annotations.NotNull
    java.util.UUID cartId) {
        return null;
    }
}