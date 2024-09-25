package com.cuscatlan.products.infrastructure.external;

import com.cuscatlan.products.application.dto.ProductDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(
        name = "product-client",
        url = "https://fakestoreapi.com"
)
public interface ProductClient {

    @GetMapping("/products")
    List<ProductDto> getProducts();

    @GetMapping("/products/{id}")
    ProductDto getProductById(@PathVariable("id") Long id);
}
