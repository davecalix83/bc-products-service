package com.cuscatlan.products.domain.exception;

/**
 *
 * @author hguzman
 */
public class ProductNotFoundException extends RuntimeException {

    public ProductNotFoundException(Long productId) {
        super("Product not found: " + productId);
    }
}
