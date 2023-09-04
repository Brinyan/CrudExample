package com.proyecto.ejemplo.dto.product.v1;

import com.proyecto.ejemplo.model.product.v1.Product;
import java.util.UUID;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-01T12:48:26-0500",
    comments = "version: 1.4.1.Final, compiler: IncrementalProcessingEnvironment from kotlin-annotation-processing-gradle-1.8.22.jar, environment: Java 17.0.8 (Amazon.com Inc.)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public ProductDto toDto(Product product) {
        if ( product == null ) {
            return null;
        }

        UUID idProduct = null;
        String nameProduct = null;
        int skuProduct = 0;
        long priceProduct = 0L;

        if ( product.getIdProduct() != null ) {
            idProduct = product.getIdProduct();
        }
        if ( product.getNameProduct() != null ) {
            nameProduct = product.getNameProduct();
        }
        skuProduct = product.getSkuProduct();
        if ( product.getPriceProduct() != null ) {
            priceProduct = product.getPriceProduct();
        }

        ProductDto productDto = new ProductDto( idProduct, nameProduct, skuProduct, priceProduct );

        return productDto;
    }

    @Override
    public Product toEntity(ProductRequest productRequest) {
        if ( productRequest == null ) {
            return null;
        }

        String nameProduct = null;
        int skuProduct = 0;
        Long priceProduct = null;

        if ( productRequest.getNameProduct() != null ) {
            nameProduct = productRequest.getNameProduct();
        }
        skuProduct = productRequest.getSkuProduct();
        priceProduct = productRequest.getPriceProduct();

        Product product = new Product( nameProduct, skuProduct, priceProduct );

        return product;
    }

    @Override
    public void updateProduct(ProductUpdateRequest productUpdateRequest, Product product) {
        if ( productUpdateRequest == null ) {
            return;
        }

        if ( productUpdateRequest.getNameProduct() != null ) {
            product.setNameProduct( productUpdateRequest.getNameProduct() );
        }
        if ( productUpdateRequest.getSkuProduct() != null ) {
            product.setSkuProduct( productUpdateRequest.getSkuProduct() );
        }
    }
}
