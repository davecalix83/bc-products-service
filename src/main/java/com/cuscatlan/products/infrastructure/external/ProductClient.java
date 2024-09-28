package com.cuscatlan.products.infrastructure.external;

import com.cuscatlan.products.application.dto.ProductDto;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Feign client for interacting with the external product API.
 * <p>
 * This interface defines the methods for retrieving product information
 * from the Fake Store API using Feign.
 * </p>
 */
@FeignClient(
        name = "product-client",
        url = "https://fakestoreapi.com"
)
public interface ProductClient {

    /**
     * Retrieves a list of all products.
     * 
     * @return a list of {@link ProductDto} representing all products.
     */
    @GetMapping("/products")
    List<ProductDto> getProducts();

    /**
     * Retrieves a product by its ID.
     * 
     * @param id the ID of the product to retrieve.
     * @return a {@link ProductDto} representing the product with the specified ID.
     */
    @GetMapping("/products/{id}")
    ProductDto getProductById(@PathVariable("id") Long id);
}
