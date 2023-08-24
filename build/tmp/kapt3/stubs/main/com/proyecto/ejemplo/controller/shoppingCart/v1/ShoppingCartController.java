package com.proyecto.ejemplo.controller.shoppingCart.v1;

@org.springframework.web.bind.annotation.RestController
@org.springframework.web.bind.annotation.RequestMapping(value = {"/v1/shoppingCart"})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/proyecto/ejemplo/controller/shoppingCart/v1/ShoppingCartController;", "", "productService", "Lcom/proyecto/ejemplo/service/product/ProductService;", "(Lcom/proyecto/ejemplo/service/product/ProductService;)V", "ejemplo"})
public class ShoppingCartController {
    @org.jetbrains.annotations.NotNull
    private final com.proyecto.ejemplo.service.product.ProductService productService = null;
    
    public ShoppingCartController(@org.jetbrains.annotations.NotNull
    com.proyecto.ejemplo.service.product.ProductService productService) {
        super();
    }
}