package com.cuscatlan.products.application.service;

import com.cuscatlan.products.application.dto.ProductDto;
import com.cuscatlan.products.domain.exception.ProductNotFoundException;
import com.cuscatlan.products.domain.exception.ProductServiceException;
import com.cuscatlan.products.infrastructure.external.ProductClient;
import java.util.Collections;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductClient productClient;

    @Override
    public List<ProductDto> getAllProducts() {
        try {
            List<ProductDto> productDtos = productClient.getProducts();
            return productDtos != null ? productDtos : Collections.emptyList();
        } catch (Exception e) {
            throw new ProductServiceException("Failed to retrieve products from product service");
        }
    }

    @Override
    public ProductDto getProductById(Long id) {
        ProductDto productDto;
        productDto = productClient.getProductById(id);
        if (productDto == null) {
            throw new ProductNotFoundException(id);
        }
        return productDto;
    }
}
