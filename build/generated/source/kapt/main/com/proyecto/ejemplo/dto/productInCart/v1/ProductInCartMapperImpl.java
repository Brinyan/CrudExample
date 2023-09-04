package com.proyecto.ejemplo.dto.productInCart.v1;

import com.proyecto.ejemplo.dto.product.v1.ProductDto;
import com.proyecto.ejemplo.dto.product.v1.ProductMapper;
import com.proyecto.ejemplo.model.product.v1.Product;
import com.proyecto.ejemplo.model.productInCar.v1.ProductInCart;
import com.proyecto.ejemplo.model.shoppingCart.v1.ShoppingCart;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-01T12:50:07-0500",
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

        ProductDto product = null;
        int quantity = 0;
        long totalCost = 0L;

        if ( productInCart.getProduct() != null ) {
            product = productMapper.toDto( productInCart.getProduct() );
        }
        quantity = productInCart.getQuantity();
        totalCost = productInCart.getTotalCost();

        ProductInCartDto productInCartDto = new ProductInCartDto( product, quantity, totalCost );

        return productInCartDto;
    }

    @Override
    public ProductInCart toEntity(ProductInCartRequest productInCartRequest) {
        if ( productInCartRequest == null ) {
            return null;
        }

        int quantity = 0;

        quantity = productInCartRequest.getQuantity();

        ShoppingCart shoppingCart = null;
        Product product = null;
        long totalCost = 0L;

        ProductInCart productInCart = new ProductInCart( shoppingCart, product, totalCost, quantity );

        return productInCart;
    }
}
