package com.proyecto.ejemplo.dto.shoppingCart.v1;

import com.proyecto.ejemplo.model.shoppingCart.v1.ShoppingCart;
import java.time.LocalDateTime;
import java.util.UUID;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-24T09:24:26-0500",
    comments = "version: 1.4.1.Final, compiler: IncrementalProcessingEnvironment from kotlin-annotation-processing-gradle-1.8.22.jar, environment: Java 17.0.8 (Amazon.com Inc.)"
)
@Component
public class ShoppingCartMapperImpl implements ShoppingCartMapper {

    @Override
    public ShoppingCartDto toDto(ShoppingCart shoppingCart) {
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
