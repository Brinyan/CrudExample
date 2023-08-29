package com.proyecto.ejemplo.dto.productInCart.v1;

import com.proyecto.ejemplo.dto.product.v1.ProductDto;
import com.proyecto.ejemplo.dto.product.v1.ProductMapper;
import com.proyecto.ejemplo.dto.shoppingCart.v1.ShoppingCartDto;
import com.proyecto.ejemplo.model.product.v1.Product;
import com.proyecto.ejemplo.model.productInCar.v1.ProductInCart;
import com.proyecto.ejemplo.model.shoppingCart.v1.ShoppingCart;
import java.util.UUID;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-29T10:57:04-0500",
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

        ShoppingCartDto shoppingCart = null;
        ProductDto product = null;
        int quantity = 0;

        if ( productInCart.getShoppingCart() != null ) {
            shoppingCart = shoppingCartToShoppingCartDto( productInCart.getShoppingCart() );
        }
        if ( productInCart.getProduct() != null ) {
            product = productMapper.toDto( productInCart.getProduct() );
        }
        quantity = productInCart.getQuantity();

        ProductInCartDto productInCartDto = new ProductInCartDto( shoppingCart, product, quantity );

        return productInCartDto;
    }

    @Override
    public ProductInCart toEntity(ProductInCartRequest productInCartRequest) {
        if ( productInCartRequest == null ) {
            return null;
        }

        int quantity = 0;

        quantity = productInCartRequest.getQuantity();

        int idShop = 0;
        ShoppingCart shoppingCart = null;
        Product product = null;
        long totalCost = 0L;
        int totalProduct = 0;

        ProductInCart productInCart = new ProductInCart( idShop, shoppingCart, product, totalCost, totalProduct, quantity );

        return productInCart;
    }

    protected ShoppingCartDto shoppingCartToShoppingCartDto(ShoppingCart shoppingCart) {
        if ( shoppingCart == null ) {
            return null;
        }

        UUID idCart = null;

        if ( shoppingCart.getIdCart() != null ) {
            idCart = shoppingCart.getIdCart();
        }

        ShoppingCartDto shoppingCartDto = new ShoppingCartDto( idCart );

        return shoppingCartDto;
    }
}
