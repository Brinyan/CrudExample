package com.proyecto.ejemplo.service.productInCart.impl;

@org.springframework.stereotype.Service
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/proyecto/ejemplo/service/productInCart/impl/ProductInCartServiceImpl;", "Lcom/proyecto/ejemplo/service/productInCart/ProductInCartService;", "shoppingCartRepository", "Lcom/proyecto/ejemplo/repositories/ShoppingCartRepository;", "productRepository", "Lcom/proyecto/ejemplo/repositories/ProductRepository;", "productInCartRepository", "Lcom/proyecto/ejemplo/repositories/ProductInCartRepository;", "productInCartMapper", "Lcom/proyecto/ejemplo/dto/productInCart/v1/ProductInCartMapper;", "(Lcom/proyecto/ejemplo/repositories/ShoppingCartRepository;Lcom/proyecto/ejemplo/repositories/ProductRepository;Lcom/proyecto/ejemplo/repositories/ProductInCartRepository;Lcom/proyecto/ejemplo/dto/productInCart/v1/ProductInCartMapper;)V", "addProductToCart", "Lcom/proyecto/ejemplo/dto/productInCart/v1/ProductInCartDto;", "productInCartRequest", "Lcom/proyecto/ejemplo/dto/productInCart/v1/ProductInCartRequest;", "deleteProductInCart", "", "updateProductQuantity", "ejemplo"})
public class ProductInCartServiceImpl implements com.proyecto.ejemplo.service.productInCart.ProductInCartService {
    @org.jetbrains.annotations.NotNull
    private final com.proyecto.ejemplo.repositories.ShoppingCartRepository shoppingCartRepository = null;
    @org.jetbrains.annotations.NotNull
    private final com.proyecto.ejemplo.repositories.ProductRepository productRepository = null;
    @org.jetbrains.annotations.NotNull
    private final com.proyecto.ejemplo.repositories.ProductInCartRepository productInCartRepository = null;
    @org.jetbrains.annotations.NotNull
    private final com.proyecto.ejemplo.dto.productInCart.v1.ProductInCartMapper productInCartMapper = null;
    
    public ProductInCartServiceImpl(@org.jetbrains.annotations.NotNull
    com.proyecto.ejemplo.repositories.ShoppingCartRepository shoppingCartRepository, @org.jetbrains.annotations.NotNull
    com.proyecto.ejemplo.repositories.ProductRepository productRepository, @org.jetbrains.annotations.NotNull
    com.proyecto.ejemplo.repositories.ProductInCartRepository productInCartRepository, @org.jetbrains.annotations.NotNull
    com.proyecto.ejemplo.dto.productInCart.v1.ProductInCartMapper productInCartMapper) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.proyecto.ejemplo.dto.productInCart.v1.ProductInCartDto addProductToCart(@org.jetbrains.annotations.NotNull
    com.proyecto.ejemplo.dto.productInCart.v1.ProductInCartRequest productInCartRequest) {
        return null;
    }
    
    @java.lang.Override
    public void deleteProductInCart(@org.jetbrains.annotations.NotNull
    com.proyecto.ejemplo.dto.productInCart.v1.ProductInCartRequest productInCartRequest) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.proyecto.ejemplo.dto.productInCart.v1.ProductInCartDto updateProductQuantity(@org.jetbrains.annotations.NotNull
    com.proyecto.ejemplo.dto.productInCart.v1.ProductInCartRequest productInCartRequest) {
        return null;
    }
}