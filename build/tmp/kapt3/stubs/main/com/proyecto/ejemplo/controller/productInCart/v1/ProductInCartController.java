package com.proyecto.ejemplo.controller.productInCart.v1;

@org.springframework.web.bind.annotation.RestController
@org.springframework.web.bind.annotation.RequestMapping(value = {"/v1/productInCart"})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\u0017J\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\u0017J\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/proyecto/ejemplo/controller/productInCart/v1/ProductInCartController;", "", "productInCartService", "Lcom/proyecto/ejemplo/service/productInCart/ProductInCartService;", "(Lcom/proyecto/ejemplo/service/productInCart/ProductInCartService;)V", "addProductToCart", "Lorg/springframework/http/ResponseEntity;", "Lcom/proyecto/ejemplo/dto/productInCart/v1/ProductInCartDto;", "productInCartRequest", "Lcom/proyecto/ejemplo/dto/productInCart/v1/ProductInCartRequest;", "deleteProductInCart", "Lorg/springframework/http/HttpStatus;", "updateProductQuantity", "ejemplo"})
public class ProductInCartController {
    @org.jetbrains.annotations.NotNull
    private final com.proyecto.ejemplo.service.productInCart.ProductInCartService productInCartService = null;
    
    public ProductInCartController(@org.jetbrains.annotations.NotNull
    com.proyecto.ejemplo.service.productInCart.ProductInCartService productInCartService) {
        super();
    }
    
    @org.springframework.web.bind.annotation.PostMapping(value = {"addProduct"})
    @org.jetbrains.annotations.NotNull
    public org.springframework.http.ResponseEntity<com.proyecto.ejemplo.dto.productInCart.v1.ProductInCartDto> addProductToCart(@org.springframework.web.bind.annotation.RequestBody
    @org.jetbrains.annotations.NotNull
    com.proyecto.ejemplo.dto.productInCart.v1.ProductInCartRequest productInCartRequest) {
        return null;
    }
    
    @org.springframework.web.bind.annotation.PostMapping(value = {"deleteProduct"})
    @org.jetbrains.annotations.NotNull
    public org.springframework.http.ResponseEntity<org.springframework.http.HttpStatus> deleteProductInCart(@org.springframework.web.bind.annotation.RequestBody
    @org.jetbrains.annotations.NotNull
    com.proyecto.ejemplo.dto.productInCart.v1.ProductInCartRequest productInCartRequest) {
        return null;
    }
    
    @org.springframework.web.bind.annotation.PatchMapping(value = {"/updateProductQuantity"})
    @org.jetbrains.annotations.NotNull
    public org.springframework.http.ResponseEntity<com.proyecto.ejemplo.dto.productInCart.v1.ProductInCartDto> updateProductQuantity(@org.springframework.web.bind.annotation.RequestBody
    @org.jetbrains.annotations.NotNull
    com.proyecto.ejemplo.dto.productInCart.v1.ProductInCartRequest productInCartRequest) {
        return null;
    }
}