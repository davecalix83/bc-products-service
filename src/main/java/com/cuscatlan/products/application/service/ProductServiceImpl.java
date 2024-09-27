package com.cuscatlan.products.application.service;

import com.cuscatlan.products.application.dto.ProductDto;
import com.cuscatlan.products.domain.exception.ProductNotFoundException;
import com.cuscatlan.products.domain.exception.ProductServiceException;
import com.cuscatlan.products.infrastructure.external.ProductClient;
import java.util.Collections;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Implementation of the {@link ProductService} interface for product-related operations.
 * <p>
 * This service acts as a bridge between the application layer and the external product service. 
 * It handles the retrieval of product information and appropriate exception handling.
 * </p> 
 */
@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductClient productClient;

    /**
     * Retrieves all products from the external product service.
     *
     * @return a list of {@link ProductDto} representing all available products.
     * @throws ProductServiceException if there is a failure when communicating with the external service.
     */
    @Override
    public List<ProductDto> getAllProducts() {
        try {
            List<ProductDto> productDtos = productClient.getProducts();
            return productDtos != null ? productDtos : Collections.emptyList();
        } catch (Exception e) {
            throw new ProductServiceException("Failed to retrieve products from the external product service.");
        }
    }

    /**
     * Retrieves a specific product by its unique identifier from the external product service.
     *
     * @param id the unique identifier of the product.
     * @return a {@link ProductDto} representing the product with the specified ID.
     * @throws ProductNotFoundException if no product with the specified ID is found.
     * @throws ProductServiceException if there is a failure when communicating with the external service.
     */
    @Override
    public ProductDto getProductById(Long id) {
        try {
            ProductDto productDto = productClient.getProductById(id);
            if (productDto == null) {
                throw new ProductNotFoundException(id);
            }
            return productDto;
        } catch (ProductNotFoundException e) {
            throw e;
        } catch (Exception e) {
            throw new ProductServiceException("Failed to retrieve product with ID: ");
        }
    }
}
