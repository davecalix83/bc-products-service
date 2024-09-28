package com.cuscatlan.products.application.service;

import com.cuscatlan.products.application.dto.ProductDto;
import java.util.List;

/**
 * ProductService defines the contract for product-related operations.
 * <p>
 * This interface serves as the abstraction for product services, following the
 * Dependency Inversion Principle (DIP). It provides methods for retrieving all
 * products and fetching a product by its unique ID.
 * </p>
 */
public interface ProductService {

    /**
     * Retrieves all products.
     *
     * @return a list of ProductDto objects representing all available products.
     */
    List<ProductDto> getAllProducts();

    /**
     * Retrieves a product by its unique ID.
     *
     * @param id the unique identifier of the product to retrieve
     * @return a ProductDto object representing the requested product, or null if not found.
     */
    ProductDto getProductById(Long id);
}
