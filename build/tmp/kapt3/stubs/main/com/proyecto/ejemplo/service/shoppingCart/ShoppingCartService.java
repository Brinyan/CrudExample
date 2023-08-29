package com.proyecto.ejemplo.service.shoppingCart;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/proyecto/ejemplo/service/shoppingCart/ShoppingCartService;", "", "createShoppingCart", "Lcom/proyecto/ejemplo/dto/shoppingCart/v1/ShoppingCartDto;", "shoppingCartRequest", "Lcom/proyecto/ejemplo/dto/shoppingCart/v1/ShoppingCartRequest;", "ejemplo"})
public abstract interface ShoppingCartService {
    
    @org.jetbrains.annotations.NotNull
    public abstract com.proyecto.ejemplo.dto.shoppingCart.v1.ShoppingCartDto createShoppingCart(@org.jetbrains.annotations.NotNull
    com.proyecto.ejemplo.dto.shoppingCart.v1.ShoppingCartRequest shoppingCartRequest);
}