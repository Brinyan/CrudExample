package com.proyecto.ejemplo.dto.shoppingCart.v1;

import com.proyecto.ejemplo.dto.productInCart.v1.ProductInCartDto;
import com.proyecto.ejemplo.dto.productInCart.v1.ProductInCartMapper;
import com.proyecto.ejemplo.model.productInCar.v1.ProductInCart;
import com.proyecto.ejemplo.model.shoppingCart.v1.ShoppingCart;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-04T11:54:01-0500",
    comments = "version: 1.4.1.Final, compiler: IncrementalProcessingEnvironment from kotlin-annotation-processing-gradle-1.8.22.jar, environment: Java 17.0.8 (Amazon.com Inc.)"
)
@Component
public class ShoppingCartMapperImpl implements ShoppingCartMapper {

    @Autowired
    private ProductInCartMapper productInCartMapper;

    @Override
    public ShoppingCartDto toDto(ShoppingCart shoppingCart) {
        if ( shoppingCart == null ) {
            return null;
        }

        List<ProductInCartDto> products = null;
        UUID idCart = null;
        LocalDateTime dateCreation = null;

        List<ProductInCartDto> list = productInCartListToProductInCartDtoList( shoppingCart.getProducts() );
        if ( list != null ) {
            products = list;
        }
        if ( shoppingCart.getIdCart() != null ) {
            idCart = shoppingCart.getIdCart();
        }
        if ( shoppingCart.getDateCreation() != null ) {
            dateCreation = shoppingCart.getDateCreation();
        }

        ShoppingCartDto shoppingCartDto = new ShoppingCartDto( idCart, dateCreation, products );

        return shoppingCartDto;
    }

    @Override
    public ShoppingCart toEntity(ShoppingCartRequest shoppingCartRequest) {
        if ( shoppingCartRequest == null ) {
            return null;
        }

        ShoppingCart shoppingCart = new ShoppingCart();

        return shoppingCart;
    }

    protected List<ProductInCartDto> productInCartListToProductInCartDtoList(List<ProductInCart> list) {
        if ( list == null ) {
            return null;
        }

        List<ProductInCartDto> list1 = new ArrayList<ProductInCartDto>( list.size() );
        for ( ProductInCart productInCart : list ) {
            list1.add( productInCartMapper.toDto( productInCart ) );
        }

        return list1;
    }
}
