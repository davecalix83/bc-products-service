package com.cuscatlan.products.application.service;

import com.cuscatlan.products.application.dto.ProductDto;
import com.cuscatlan.products.infrastructure.external.ProductClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductClient productClient;

    @Override
    public List<ProductDto> getAllProducts() {
        List<ProductDto> productDtos = productClient.getProducts();
        return productDtos != null ? productDtos : Collections.emptyList();
    }

    @Override
    public ProductDto getProductById(Long id) {
        ProductDto productDto = productClient.getProductById(id);
        return productDto;
    }
}
