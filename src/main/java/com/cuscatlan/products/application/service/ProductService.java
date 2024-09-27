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

    List<ProductDto> getAllProducts();

    ProductDto getProductById(Long id);
}
