package com.proyecto.ejemplo.repositories;

@org.springframework.stereotype.Repository
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u001e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&\u00a8\u0006\t"}, d2 = {"Lcom/proyecto/ejemplo/repositories/ProductInCartRepository;", "Lorg/springframework/data/jpa/repository/JpaRepository;", "Lcom/proyecto/ejemplo/model/productInCar/v1/ProductInCart;", "", "findByProductIdProductAndShoppingCartIdCart", "Ljava/util/Optional;", "idProduct", "Ljava/util/UUID;", "idCart", "ejemplo"})
public abstract interface ProductInCartRepository extends org.springframework.data.jpa.repository.JpaRepository<com.proyecto.ejemplo.model.productInCar.v1.ProductInCart, java.lang.Integer> {
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.Optional<com.proyecto.ejemplo.model.productInCar.v1.ProductInCart> findByProductIdProductAndShoppingCartIdCart(@org.jetbrains.annotations.NotNull
    java.util.UUID idProduct, @org.jetbrains.annotations.NotNull
    java.util.UUID idCart);
}