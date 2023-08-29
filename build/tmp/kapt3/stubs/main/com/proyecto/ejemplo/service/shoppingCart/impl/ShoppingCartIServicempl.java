package com.proyecto.ejemplo.service.shoppingCart.impl;

@org.springframework.stereotype.Service
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/proyecto/ejemplo/service/shoppingCart/impl/ShoppingCartIServicempl;", "Lcom/proyecto/ejemplo/service/shoppingCart/ShoppingCartService;", "shoppingCartRepository", "Lcom/proyecto/ejemplo/repositories/ShoppingCartRepository;", "shoppingCartMapper", "Lcom/proyecto/ejemplo/dto/shoppingCart/v1/ShoppingCartMapper;", "(Lcom/proyecto/ejemplo/repositories/ShoppingCartRepository;Lcom/proyecto/ejemplo/dto/shoppingCart/v1/ShoppingCartMapper;)V", "createShoppingCart", "Lcom/proyecto/ejemplo/dto/shoppingCart/v1/ShoppingCartDto;", "shoppingCartRequest", "Lcom/proyecto/ejemplo/dto/shoppingCart/v1/ShoppingCartRequest;", "ejemplo"})
public class ShoppingCartIServicempl implements com.proyecto.ejemplo.service.shoppingCart.ShoppingCartService {
    @org.jetbrains.annotations.NotNull
    private final com.proyecto.ejemplo.repositories.ShoppingCartRepository shoppingCartRepository = null;
    @org.jetbrains.annotations.NotNull
    private final com.proyecto.ejemplo.dto.shoppingCart.v1.ShoppingCartMapper shoppingCartMapper = null;
    
    public ShoppingCartIServicempl(@org.jetbrains.annotations.NotNull
    com.proyecto.ejemplo.repositories.ShoppingCartRepository shoppingCartRepository, @org.jetbrains.annotations.NotNull
    com.proyecto.ejemplo.dto.shoppingCart.v1.ShoppingCartMapper shoppingCartMapper) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.proyecto.ejemplo.dto.shoppingCart.v1.ShoppingCartDto createShoppingCart(@org.jetbrains.annotations.NotNull
    com.proyecto.ejemplo.dto.shoppingCart.v1.ShoppingCartRequest shoppingCartRequest) {
        return null;
    }
}