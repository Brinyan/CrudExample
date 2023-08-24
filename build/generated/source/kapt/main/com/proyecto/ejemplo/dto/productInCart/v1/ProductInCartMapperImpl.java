package com.proyecto.ejemplo.dto.productInCart.v1;

import com.proyecto.ejemplo.dto.product.v1.ProductDto;
import com.proyecto.ejemplo.dto.product.v1.ProductMapper;
import com.proyecto.ejemplo.dto.shoppingCart.v1.ShoppingCartDto;
import com.proyecto.ejemplo.model.productInCar.v1.ProductInCart;
import com.proyecto.ejemplo.model.shoppingCart.v1.ShoppingCart;
import java.time.LocalDateTime;
import java.util.UUID;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-24T11:46:17-0500",
    comments = "version: 1.4.1.Final, compiler: IncrementalProcessingEnvironment from kotlin-annotation-processing-gradle-1.8.22.jar, environment: Java 17.0.8 (Amazon.com Inc.)"
)
@Component
public class ProductInCartMapperImpl implements ProductInCartMapper {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public ProductInCartDto toDto(ProductInCart productInCart) {
        if ( productInCart == null ) {
            return null;
        }

        Integer idShop = null;
        ShoppingCartDto shoppingCart = null;
        Integer totalCost = null;
        ProductDto product = null;
        Integer totalProduct = null;

        idShop = productInCart.getIdShop();
        if ( productInCart.getShoppingCart() != null ) {
            shoppingCart = shoppingCartToShoppingCartDto( productInCart.getShoppingCart() );
        }
        totalCost = productInCart.getTotalCost();
        if ( productInCart.getProduct() != null ) {
            product = productMapper.toDto( productInCart.getProduct() );
        }
        totalProduct = productInCart.getTotalProduct();

        ProductInCartDto productInCartDto = new ProductInCartDto( idShop, shoppingCart, totalCost, product, totalProduct );

        return productInCartDto;
    }

    protected ShoppingCartDto shoppingCartToShoppingCartDto(ShoppingCart shoppingCart) {
        if ( shoppingCart == null ) {
            return null;
        }

        UUID idCart = null;
        LocalDateTime dateCreation = null;

        if ( shoppingCart.getIdCart() != null ) {
            idCart = shoppingCart.getIdCart();
        }
        if ( shoppingCart.getDateCreation() != null ) {
            dateCreation = shoppingCart.getDateCreation();
        }

        ShoppingCartDto shoppingCartDto = new ShoppingCartDto( idCart, dateCreation );

        return shoppingCartDto;
    }
}
