package com.proyecto.ejemplo.dto.product.v1;

import com.proyecto.ejemplo.model.product.v1.Product;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-24T11:46:17-0500",
    comments = "version: 1.4.1.Final, compiler: IncrementalProcessingEnvironment from kotlin-annotation-processing-gradle-1.8.22.jar, environment: Java 17.0.8 (Amazon.com Inc.)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public ProductDto toDto(Product product) {
        if ( product == null ) {
            return null;
        }

        int idProduct = 0;
        String nameProduct = null;
        int skuProduct = 0;
        long priceProduct = 0L;

        idProduct = product.getIdProduct();
        if ( product.getNameProduct() != null ) {
            nameProduct = product.getNameProduct();
        }
        skuProduct = product.getSkuProduct();
        priceProduct = product.getPriceProduct();

        ProductDto productDto = new ProductDto( idProduct, nameProduct, skuProduct, priceProduct );

        return productDto;
    }

    @Override
    public Product toEntity(ProductRequest productRequest) {
        if ( productRequest == null ) {
            return null;
        }

        int idProduct = 0;
        String nameProduct = null;
        int skuProduct = 0;
        long priceProduct = 0L;

        idProduct = productRequest.getIdProduct();
        if ( productRequest.getNameProduct() != null ) {
            nameProduct = productRequest.getNameProduct();
        }
        skuProduct = productRequest.getSkuProduct();
        priceProduct = productRequest.getPriceProduct();

        Product product = new Product( idProduct, nameProduct, skuProduct, priceProduct );

        return product;
    }
}
