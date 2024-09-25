package com.cuscatlan.products.application.service;

import com.cuscatlan.products.application.dto.ProductDto;

import java.util.List;

public interface ProductService {
    List<ProductDto> getAllProducts();
    ProductDto getProductById(Long id);
}
